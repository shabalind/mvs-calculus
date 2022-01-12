  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const double &v4) {
    double v9 = v4;
    v9 = v4;
    double v28 = v4;
    const std::vector<double> v22 { v9, v4, v28, v28, v9, v9 };
    std::vector<double> v16 = v22;
    const std::vector<double> v35 = v1[1];
    v16[2] = v9;
    const double v33 = v35[0];
    v16 = v22;
    v28 = v33;
    const std::vector<std::vector<double>> v95 { v22, v16, v22, v16, v22, v16 };
    std::vector<std::vector<double>> v219 = v95;
    const std::vector<double> v62 = v219[1];
    const double v105 = v62[5];
    return v105;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 }, { 3.0 } });
    std::vector<std::vector<double>> v2({ { 4.0 }, { 5.0 }, { 6.0 } });
    std::vector<std::vector<double>> v3({ { 7.0 } });
    double v4(8.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
