  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f39(const double &v0) {
    double v3 = v0;
    double v4 = v3;
    double v2 = v3;
    double v1 = v0;
    double v13 = v0;
    double v6 = v1;
    double v10 = v3;
    double v5 = v6;
    const std::vector<double> v16 { v6, v2, v2, v5, v3, v4, v5 };
    const double v15 = v16[5];
    std::vector<double> v12 = v16;
    const std::vector<std::vector<double>> v35 { v12, v16, v16, v12, v16, v12, v12 };
    const std::vector<std::vector<double>> v19 { v12, v16, v12, v16, v16, v12, v12 };
    v12[4] = v4;
    double v24 = v15;
    std::vector<double> v14 = v12;
    const std::vector<double> v37 = v19[1];
    v14[5] = v4;
    const double v31 = v12[4];
    const std::vector<double> v23 = v19[0];
    const std::vector<double> v45 = v19[4];
    std::vector<std::vector<double>> v40 = v35;
    v12[4] = v15;
    v40[2] = v45;
    v14[5] = v6;
    const std::vector<std::vector<std::vector<double>>> v32 { v40, v35, v19, v40 };
    v40[6] = v14;
    std::vector<std::vector<std::vector<double>>> v18 = v32;
    const std::vector<double> v28 = v19[6];
    v40[0] = v28;
    const std::vector<std::vector<double>> v22 = v18[3];
    v13 = v24;
    const std::vector<std::vector<double>> v62 = v32[2];
    const double v52 = v4 - v2;
    const std::vector<double> v27 = v35[6];
    v18[3] = v19;
    v10 = v3;
    std::vector<double> v59 = v14;
    const std::vector<double> v51 = v62[2];
    v14[3] = v10;
    const double v85 = v16[4];
    v12[1] = v13;
    const double v36 = v51[6];
    v59[3] = v24;
    const std::vector<double> v109 = v22[5];
    v12 = v51;
    const double v47 = v37[4];
    v40[0] = v28;
    v1 = v85;
    v18[2] = v19;
    const std::vector<std::vector<double>> v79 { v27, v23, v59, v109, v12 };
    const std::vector<double> v170 = v79[4];
    v5 = v31;
    const double v179 = v170[2];
    v13 = v52;
    v12[6] = v47;
    v14[1] = v10;
    const double v185 = v36 - v179;
    return v185;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    double v4 = v1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<double> v8 = v7[0];
    const double v11 = f39(v1);
    const double v21 = f39(v11);
    const double v12 = v8[0];
    v4 = v12;
    double v50 = v4;
    const std::vector<std::vector<double>> v34 = v0.p1;
    const std::vector<double> v39 = v34[0];
    std::vector<double> v175 = v39;
    const double v124 = v175[0];
    double v77 = v21;
    const double v166 = f39(v50);
    v77 = v124;
    v175[0] = v166;
    return v77;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
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
