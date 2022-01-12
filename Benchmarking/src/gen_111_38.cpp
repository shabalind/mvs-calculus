  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    double v7 = v1;
    const std::vector<double> v5 { v1, v7, v1 };
    v7 = v1;
    std::vector<double> v6 = v5;
    v6[0] = v1;
    v6 = v5;
    const double v13 = v6[1];
    v6[2] = v7;
    v6[1] = v13;
    v6[1] = v1;
    std::vector<double> v14 = v6;
    const double v22 = v5[2];
    const double v20 = v6[1];
    v6[0] = v1;
    const double v34 = v6[0];
    v6[2] = v34;
    v7 = v20;
    std::vector<double> v46 = v14;
    v6[0] = v22;
    const double v62 = v46[0];
    return v62;
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
