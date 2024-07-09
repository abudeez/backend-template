# Back-end Template

# Usage

1. Install Nix if you are not on NixOS, follow the instructions [here](https://nixos.org/download/)
2. Create `~/.config/nix/nix.conf`
  ``` shell
  mkdir -p ~/.config/nix/
  touch ~/.config/nix/nix.conf
  ```
3. Add configuration
  ``` shell
  echo "experimental-features = nix-command flakes" > ~/.config/nix/nix.conf
  ```
  This enables using the commands `nix flake update` and `nix develop`

4. [Install](https://direnv.net/docs/installation.html) `direnv`

5. Run `direnv allow` in the project directory

6. **Launch a development environment**, this will download all necessary packages.
  ``` shell
  nix develop
  ```

7. Run `bb test`
   You should see an output similar to this
   ```
   openjdk 21 2023-09-19
   OpenJDK Runtime Environment (build 21+35-nixos)
   OpenJDK 64-Bit Server VM (build 21+35-nixos, mixed mode, sharing)
   Clojure CLI version 1.11.3.1463
   babashka v1.3.190
   ```

# Setup a development environment

1. **Make sure you are in the development environment**
2. We'll use the [deps-new](https://github.com/seancorfield/deps-new) tool
   to create projects.
3. Install with
  ``` shell
  clojure -Ttools install-latest :lib io.github.seancorfield/deps-new :as new
  ```
4. Create the application
  ``` shell
  clojure -Tnew app :name com.iraqidata.com/training
  ```

5. Remove some files
  ``` shell
  rm training/README.md training/LICENSE
  ```

6. Move things to our root directory
  ``` shell
  mv training/* training/.gitignore .
  ```
