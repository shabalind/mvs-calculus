  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f16(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v3 = v0[1];
    std::vector<std::vector<double>> v2 = v0;
    v2[0] = v3;
    const std::vector<double> v8 = v2[1];
    v2[0] = v8;
    std::vector<std::vector<double>> v15 = v2;
    std::vector<std::vector<double>> v23 = v15;
    const std::vector<double> v29 = v15[0];
    v2 = v15;
    std::vector<std::vector<double>> v38 = v23;
    v38[1] = v29;
    return v38;
  }
  std::vector<std::vector<double>> f14(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v5 = f16(v0);
    const std::vector<std::vector<double>> v7 = f16(v0);
    std::vector<std::vector<double>> v9 = v7;
    std::vector<std::vector<double>> v3 = v5;
    const std::vector<double> v11 = v9[1];
    const std::vector<std::vector<double>> v6 = f16(v3);
    const std::vector<double> v8 = v0[1];
    const std::vector<std::vector<double>> v1 { v11, v11, v11, v8, v11 };
    std::vector<std::vector<double>> v25 = v6;
    std::vector<std::vector<double>> v17 = v1;
    v17[3] = v8;
    std::vector<double> v14 = v11;
    std::vector<std::vector<double>> v38 = v25;
    const std::vector<double> v32 = v17[2];
    const std::vector<std::vector<double>> v69 = f16(v38);
    v17[2] = v14;
    v38[1] = v32;
    return v69;
  }
  __attribute__((noinline))
  double f0(const double &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<double> v7 = v1[1];
    double v9 = v0;
    std::vector<double> v5 = v7;
    double v8 = v9;
    v5[0] = v0;
    const std::vector<std::vector<double>> v11 = f14(v1);
    v8 = v9;
    v5[0] = v0;
    const double v24 = v5[0];
    const std::vector<double> v17 = v11[0];
    const double v12 = v17[0];
    const std::vector<double> v34 { v12, v24, v8, v24, v9 };
    const double v80 = v34[4];
    std::vector<double> v42 = v34;
    std::vector<double> v86 = v34;
    std::vector<double> v52 = v86;
    const std::vector<std::vector<double>> v121 { v52, v52, v52, v42 };
    const double v254 = v34[1];
    const std::vector<double> v122 = v121[3];
    v5[0] = v80;
    v86[3] = v254;
    const double v139 = v122[2];
    v5[0] = v80;
    return v139;
  }
  int main() {
    double v0(0.0);
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 } });
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
