  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  double f13(const double &v0) {
    const double v6 = v0 * v0;
    double v4 = v6;
    const std::vector<double> v3 { v6, v0, v0, v0, v4 };
    const double v18 = v3[1];
    return v18;
  }
  s0 f9(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v10 = v0.p1;
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p2;
    const std::vector<std::vector<std::vector<double>>> v2 { v3, v10, v3 };
    const std::vector<double> v1 = v4[1];
    const std::vector<std::vector<double>> v9 = v0.p2;
    std::vector<std::vector<double>> v14 = v6;
    const std::vector<std::vector<double>> v12 = v0.p1;
    v14[0] = v1;
    const s0 v18(v14, v12, v5);
    const std::vector<std::vector<double>> v15 = v2[0];
    const std::vector<std::vector<double>> v21 = v18.p0;
    const std::vector<std::vector<double>> v16 = v18.p0;
    const std::vector<double> v24 = v21[2];
    const std::vector<double> v30 = v16[0];
    v14[1] = v24;
    v14[0] = v30;
    std::vector<double> v50 = v1;
    std::vector<std::vector<double>> v17 = v9;
    std::vector<std::vector<double>> v62 = v16;
    const std::vector<std::vector<double>> v43 = v18.p0;
    v62[0] = v50;
    const std::vector<std::vector<double>> v20 = v0.p2;
    s0 v31 = v0;
    v17[1] = v1;
    const std::vector<std::vector<double>> v64 = v0.p2;
    v31.p0 = v62;
    v17[1] = v1;
    v14[0] = v24;
    const std::vector<double> v44 = v20[0];
    v14[1] = v1;
    v14[1] = v24;
    std::vector<std::vector<double>> v60 = v12;
    v14[1] = v24;
    v31.p2 = v17;
    std::vector<std::vector<double>> v135 = v15;
    v17[1] = v1;
    v31.p0 = v62;
    v31.p0 = v4;
    const std::vector<std::vector<double>> v80 = v18.p2;
    v31.p1 = v135;
    v31.p0 = v16;
    s0 v68 = v31;
    const std::vector<std::vector<double>> v98 = v31.p0;
    s0 v86 = v18;
    const std::vector<std::vector<double>> v79 = v86.p0;
    const std::vector<std::vector<double>> v77 = v68.p0;
    v86.p1 = v10;
    const std::vector<std::vector<double>> v142 = v18.p2;
    s0 v69 = v31;
    v14[2] = v44;
    v68.p2 = v80;
    v69.p2 = v17;
    v68.p2 = v142;
    v31.p0 = v98;
    v86.p1 = v60;
    v86.p0 = v21;
    v31.p0 = v43;
    v69.p0 = v77;
    v69.p2 = v64;
    v69.p0 = v79;
    return v69;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v2 = v7[2];
    const std::vector<double> v11 = v4[0];
    const s0 v13 = f9(v0);
    const std::vector<double> v5 = v7[0];
    const std::vector<std::vector<double>> v15 = v13.p0;
    std::vector<std::vector<double>> v8 = v15;
    s0 v25 = v13;
    const std::vector<double> v18 = v8[0];
    v8[2] = v11;
    std::vector<std::vector<double>> v19 = v4;
    s0 v26 = v25;
    const double v12 = v18[0];
    v26.p1 = v4;
    const double v28 = f13(v12);
    v19[0] = v2;
    const s0 v40 = f9(v13);
    v25.p0 = v15;
    const std::vector<std::vector<double>> v24 = v25.p1;
    const double v29 = f13(v28);
    v26.p1 = v24;
    const std::vector<double> v45 = v19[0];
    std::vector<double> v30 = v5;
    std::vector<std::vector<double>> v59 = v19;
    const std::vector<std::vector<double>> v33 = v25.p2;
    v25.p2 = v33;
    const s0 v43(v7, v59, v33);
    const std::vector<std::vector<double>> v16 = v40.p2;
    v25.p0 = v7;
    const std::vector<std::vector<double>> v38 = v25.p0;
    v19[0] = v45;
    const std::vector<double> v42 = v33[0];
    v59[0] = v30;
    std::vector<std::vector<double>> v36 = v16;
    const double v46 = v45[0];
    const std::vector<double> v60 = v8[1];
    const std::vector<std::vector<double>> v53 = v43.p2;
    v25.p2 = v33;
    v25.p0 = v8;
    v36 = v53;
    const double v75 = f13(v46);
    std::vector<std::vector<double>> v85 = v33;
    const double v118 = v60[0];
    v59[0] = v11;
    v26.p2 = v36;
    v26.p0 = v38;
    v30[0] = v118;
    const std::vector<std::vector<double>> v69 = v26.p1;
    v19 = v69;
    const double v145 = f13(v29);
    const double v97 = v75 * v118;
    std::vector<std::vector<double>> v127 = v36;
    std::vector<std::vector<double>> v152 = v127;
    v25.p2 = v85;
    v26.p2 = v152;
    v36[1] = v42;
    v30[0] = v145;
    return v97;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 } } });
    double v1(6.0);
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
