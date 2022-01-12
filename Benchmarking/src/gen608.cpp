  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<double> v5 { v2, v2, v2, v2 };
    std::vector<double> v11 = v5;
    double v3 = v2;
    v11[0] = v2;
    const double v6 = v11[2];
    v11[1] = v6;
    v11[2] = v6;
    const std::vector<std::vector<double>> v22 { v5, v11, v5 };
    std::vector<std::vector<double>> v59 = v22;
    v11[0] = v3;
    std::vector<std::vector<double>> v51 = v22;
    v51[0] = v11;
    const std::vector<double> v76 = v51[0];
    const std::vector<double> v74 = v59[1];
    const double v58 = v74[3];
    v59[2] = v76;
    return v58;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 } });
    double v2(2.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
