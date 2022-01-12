  #include <vector>
  #include <iostream>
  #include <chrono>
  double f66(const double &v0) {
    const std::vector<double> v3 { v0, v0, v0, v0, v0, v0 };
    const std::vector<double> v2 { v0, v0, v0, v0, v0, v0, v0 };
    std::vector<double> v4 = v3;
    double v1 = v0;
    const double v7 = v2[6];
    const double v11 = v7 * v7;
    const double v13 = v2[6];
    const std::vector<double> v6 { v11, v13, v1, v11 };
    std::vector<double> v9 = v6;
    std::vector<double> v19 = v2;
    std::vector<double> v22 = v4;
    std::vector<double> v20 = v19;
    std::vector<double> v29 = v6;
    const double v24 = v20[4];
    double v21 = v1;
    const double v28 = v0 - v24;
    const double v56 = v29[2];
    const double v14 = v19[2];
    std::vector<double> v34 = v29;
    const double v67 = v20[6];
    double v47 = v7;
    std::vector<double> v37 = v6;
    const double v61 = v3[2];
    v19[1] = v47;
    const double v31 = v20[3];
    const std::vector<std::vector<double>> v43 { v3, v22 };
    const double v69 = v20[1];
    v4[1] = v61;
    std::vector<double> v40 = v9;
    v1 = v67;
    std::vector<double> v46 = v29;
    v34[2] = v28;
    v9[0] = v1;
    std::vector<double> v53 = v19;
    v20[0] = v14;
    std::vector<double> v42 = v2;
    v40 = v46;
    const double v106 = v2[2];
    std::vector<double> v64 = v42;
    std::vector<double> v118 = v64;
    std::vector<std::vector<double>> v60 = v43;
    v64[4] = v21;
    v60[0] = v22;
    std::vector<double> v63 = v118;
    v63[3] = v106;
    v42[5] = v7;
    const std::vector<double> v128 = v60[1];
    v22[4] = v106;
    v4[5] = v56;
    v34 = v37;
    v4[5] = v69;
    v34[3] = v13;
    const double v77 = v128[0];
    std::vector<double> v171 = v34;
    const double v135 = v63[2];
    const double v121 = v19[1];
    v20 = v118;
    v19[1] = v121;
    v53[5] = v135;
    v171[1] = v77;
    const double v80 = v53[6];
    v34 = v40;
    v37[1] = v31;
    const double v152 = v171[0];
    v42[6] = v80;
    return v152;
  }
  std::vector<double> f7(const std::vector<double> &v0) {
    const double v4 = v0[0];
    std::vector<double> v6 = v0;
    v6 = v0;
    v6[0] = v4;
    v6[0] = v4;
    const double v2 = f66(v4);
    v6[0] = v2;
    std::vector<double> v1 = v0;
    const double v7 = f66(v4);
    const double v3 = v6[0];
    v1[0] = v3;
    const double v11 = f66(v7);
    v1[0] = v11;
    const double v9 = v0[0];
    v6 = v1;
    v6[0] = v2;
    const double v13 = v1[0];
    v1 = v0;
    v1[0] = v11;
    v6[0] = v11;
    const double v15 = f66(v13);
    double v18 = v9;
    v1[0] = v18;
    v1[0] = v13;
    v6[0] = v9;
    std::vector<double> v60 = v1;
    v6[0] = v15;
    return v60;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v2 = v0[1];
    const std::vector<double> v3 = f7(v2);
    std::vector<double> v11 = v3;
    const double v12 = v11[0];
    return v12;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
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
