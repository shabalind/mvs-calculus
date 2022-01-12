  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const double v4 = v1 + v1;
    double v3 = v4;
    double v8 = v4;
    const std::vector<double> v13 { v3, v3, v8, v1, v3, v3 };
    double v17 = v1;
    const double v11 = v13[0];
    std::vector<double> v18 = v13;
    const double v22 = v13[1];
    std::vector<double> v21 = v13;
    v21 = v18;
    v18[5] = v11;
    std::vector<double> v19 = v21;
    const double v55 = v19[0];
    v19[1] = v1;
    v19[3] = v22;
    v18[0] = v17;
    v19 = v18;
    return v55;
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
