  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const double &v0) {
    const std::vector<double> v2 { v0 };
    std::vector<double> v1 = v2;
    const double v3 = v2[0];
    const double v5 = v1[0];
    v1[0] = v5;
    v1[0] = v3;
    v1[0] = v3;
    const std::vector<double> v6 { v5, v5, v3, v5 };
    const double v11 = v6[3];
    std::vector<double> v7 = v6;
    std::vector<double> v4 = v6;
    const std::vector<std::vector<double>> v16 { v4, v4, v4 };
    v4[2] = v0;
    const double v8 = v7[0];
    v4[2] = v11;
    double v21 = v8;
    v7[0] = v3;
    std::vector<std::vector<double>> v20 = v16;
    const double v12 = v2[0];
    const double v43 = v7[1];
    const std::vector<double> v39 = v20[0];
    v4[1] = v43;
    const std::vector<double> v35 = v20[0];
    const double v29 = v35[1];
    v4[3] = v12;
    v20[2] = v39;
    double v150 = v0;
    const double v53 = v150 + v21;
    const std::vector<double> v42 = v16[1];
    v1[0] = v53;
    const double v96 = v8 * v29;
    v20[1] = v42;
    return v96;
  }
  int main() {
    double v0(0.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
