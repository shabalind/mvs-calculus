  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v4 = v0[0];
    std::vector<double> v7 = v4;
    std::vector<double> v13 = v7;
    v7[0] = v1;
    v7[0] = v1;
    std::vector<double> v9 = v13;
    std::vector<double> v20 = v9;
    std::vector<double> v23 = v20;
    std::vector<double> v51 = v23;
    const double v120 = v51[0];
    return v120;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    double v1(1.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
