  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    std::vector<std::vector<double>> v7 = v0;
    const std::vector<double> v6 = v7[0];
    std::vector<std::vector<double>> v4 = v7;
    const std::vector<double> v9 = v0[0];
    v4[0] = v6;
    const std::vector<double> v8 = v7[0];
    v4[0] = v8;
    const std::vector<double> v3 = v4[0];
    const double v11 = v3[0];
    v7[0] = v3;
    v7[0] = v9;
    const double v17 = v11 - v11;
    v4[0] = v6;
    const std::vector<double> v28 = v0[0];
    std::vector<double> v71 = v28;
    v4[0] = v71;
    return v17;
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
