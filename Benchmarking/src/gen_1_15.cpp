  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    const double v6 = v0[0];
    std::vector<double> v8 = v0;
    const double v9 = v0[0];
    const double v3 = v0[0];
    const double v4 = v0[0];
    const double v27 = v0[0];
    double v11 = v4;
    std::vector<double> v10 = v0;
    v11 = v4;
    v10[0] = v9;
    v10[0] = v6;
    v8[0] = v4;
    v8[0] = v9;
    v8[0] = v11;
    const double v12 = v8[0];
    std::vector<double> v14 = v8;
    v11 = v27;
    const double v36 = v14[0];
    const double v28 = v8[0];
    const std::vector<double> v38 { v3, v27, v36, v28, v27, v9, v4 };
    std::vector<double> v29 = v38;
    v10[0] = v36;
    double v24 = v28;
    std::vector<double> v55 = v29;
    std::vector<double> v75 = v29;
    v29[6] = v12;
    v29[0] = v27;
    const double v100 = v10[0];
    std::vector<double> v37 = v55;
    v29[5] = v27;
    v55[2] = v100;
    std::vector<double> v88 = v75;
    const double v96 = v37[0];
    const double v127 = v37[1];
    std::vector<double> v69 = v88;
    const double v65 = v69[3];
    v8[0] = v24;
    v69[5] = v127;
    v88[5] = v127;
    v75[6] = v96;
    return v65;
  }
  int main() {
    std::vector<double> v0({ 0.0 });
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
