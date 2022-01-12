  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    const double v3 = v1 * v1;
    std::vector<double> v7 = v0;
    const double v6 = v7[0];
    v7[1] = v3;
    const double v10 = v7[1];
    const double v16 = v0[0];
    v7[0] = v16;
    const double v18 = v0[0];
    const double v14 = v0[0];
    std::vector<double> v29 = v0;
    v29[0] = v6;
    const double v30 = v29[1];
    v7[1] = v14;
    v29[0] = v10;
    const double v22 = v7[1];
    std::vector<double> v165 = v29;
    const std::vector<std::vector<double>> v56 { v165, v165 };
    double v87 = v18;
    v7[1] = v87;
    v165[0] = v87;
    const std::vector<double> v82 = v56[1];
    const double v95 = v82[0];
    v7[1] = v22;
    v165[1] = v30;
    return v95;
  }
  int main() {
    std::vector<double> v0({ 0.0, 1.0 });
    double v1(2.0);
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
