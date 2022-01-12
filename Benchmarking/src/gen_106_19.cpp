  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<double> &v1, const double &v2) {
    const std::vector<double> v9 = v0[1];
    std::vector<double> v4 = v1;
    const double v3 = v9[0];
    const double v11 = v2 * v3;
    const std::vector<double> v8 = v0[0];
    double v13 = v2;
    const double v18 = v3 - v11;
    std::vector<double> v20 = v1;
    v4[0] = v3;
    v20[2] = v11;
    double v23 = v18;
    const double v45 = v20[0];
    const double v24 = v1[2];
    v20[0] = v24;
    const double v46 = v8[0];
    const std::vector<std::vector<double>> v34 { v1, v20, v20, v20, v4 };
    std::vector<std::vector<double>> v72 = v34;
    double v43 = v23;
    const double v44 = v13 - v45;
    v72[3] = v1;
    v20[2] = v13;
    v20[0] = v46;
    const std::vector<double> v57 = v72[0];
    double v48 = v11;
    double v81 = v48;
    v4[2] = v11;
    v20[0] = v81;
    v4[1] = v44;
    v20[1] = v43;
    const double v161 = v57[2];
    return v161;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<double> v1({ 3.0, 4.0, 5.0 });
    double v2(6.0);
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
