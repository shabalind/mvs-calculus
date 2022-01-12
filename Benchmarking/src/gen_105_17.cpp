  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    double v6 = v1;
    double v4 = v6;
    const std::vector<double> v10 { v6, v1, v6, v4, v1, v1, v6 };
    v6 = v1;
    std::vector<double> v17 = v10;
    const double v32 = v10[5];
    const double v42 = v4 * v32;
    v17[1] = v42;
    std::vector<double> v26 = v17;
    const double v97 = v26[3];
    v26[4] = v1;
    return v97;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    double v1(3.0);
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
