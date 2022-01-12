  #include <vector>
  #include <iostream>
  #include <chrono>
  double f1(const double &v0) {
    double v5 = v0;
    double v3 = v5;
    double v6 = v3;
    const double v9 = v6 * v0;
    double v1 = v3;
    double v16 = v6;
    const double v2 = v5 + v6;
    double v8 = v9;
    const std::vector<double> v21 { v9, v1, v2 };
    const double v11 = v21[2];
    std::vector<double> v17 = v21;
    double v12 = v11;
    const double v15 = v21[1];
    double v22 = v6;
    v8 = v9;
    v17[0] = v22;
    const double v43 = v21[0];
    std::vector<double> v18 = v21;
    std::vector<double> v28 = v18;
    double v37 = v1;
    std::vector<double> v42 = v28;
    const double v32 = v42[1];
    const double v35 = v18[1];
    std::vector<double> v56 = v17;
    v28[2] = v35;
    std::vector<double> v23 = v21;
    v42[0] = v15;
    v18[0] = v37;
    const std::vector<std::vector<double>> v38 { v56, v17, v17, v42, v28, v42 };
    const std::vector<double> v34 = v38[1];
    v28[2] = v1;
    double v48 = v8;
    v42[2] = v2;
    const double v40 = v34[1];
    v28[0] = v12;
    v28[0] = v16;
    const double v67 = v23[0];
    v42[0] = v32;
    const std::vector<double> v110 { v35, v40, v15, v48, v67, v67, v48 };
    v18[1] = v43;
    std::vector<double> v83 = v110;
    const double v73 = v83[0];
    v42[2] = v40;
    v56[1] = v67;
    return v73;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    double v3 = v1;
    std::vector<std::vector<double>> v2 = v0;
    const std::vector<double> v9 = v2[0];
    const double v7 = v9[0];
    const std::vector<double> v11 = v0[2];
    double v20 = v3;
    double v6 = v7;
    v2[0] = v11;
    const double v18 = v9[0];
    v2[1] = v9;
    std::vector<double> v28 = v9;
    const double v29 = v28[0];
    const double v16 = f1(v20);
    v28[0] = v3;
    v2[1] = v9;
    v28[0] = v6;
    v28[0] = v18;
    const double v78 = v29 / v16;
    return v78;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    double v1(3.0);
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
