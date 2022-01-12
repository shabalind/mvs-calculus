  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const std::vector<double> v4 = v1[0];
    std::vector<double> v12 = v4;
    const double v8 = v4[0];
    const std::vector<double> v14 = v1[0];
    v12[0] = v3;
    std::vector<double> v15 = v14;
    const std::vector<double> v9 = v0[0];
    std::vector<double> v23 = v9;
    double v21 = v8;
    const std::vector<double> v51 = v1[0];
    const double v43 = v15[0];
    const double v62 = v12[0];
    v12 = v23;
    const double v47 = v12[0];
    const std::vector<double> v65 { v8, v47, v43, v3, v62 };
    const double v79 = v51[0];
    std::vector<double> v172 = v65;
    v172[0] = v47;
    std::vector<double> v180 = v172;
    const double v135 = v180[1];
    double v124 = v21;
    v15[0] = v79;
    double v81 = v135;
    v180[0] = v124;
    return v81;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 } });
    std::vector<std::vector<double>> v2({ { 2.0 } });
    double v3(3.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
