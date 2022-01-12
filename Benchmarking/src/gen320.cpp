  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s0 p1;
    s4(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s4 f105(const s4 &v0) {
    const s0 v7 = v0.p1;
    s0 v6 = v7;
    s4 v21 = v0;
    v21.p1 = v6;
    return v21;
  }
  s0 f72(const s0 &v0) {
    const std::vector<double> v1 = v0.p1;
    const std::vector<double> v5 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<double> v2 = v6[1];
    const std::vector<double> v8 = v0.p1;
    const double v4 = v5[1];
    std::vector<std::vector<double>> v7 = v6;
    const double v10 = v8[1];
    std::vector<std::vector<double>> v12 = v6;
    std::vector<double> v13 = v2;
    const double v9 = v2[0];
    const std::vector<std::vector<double>> v11 = v0.p0;
    std::vector<double> v15 = v1;
    std::vector<double> v19 = v8;
    const std::vector<s0> v34 { v0, v0 };
    const std::vector<double> v14 = v7[0];
    const std::vector<double> v21 = v0.p1;
    v13[0] = v4;
    const s0 v24 = v34[1];
    const double v17 = v13[0];
    v15[1] = v10;
    const std::vector<std::vector<double>> v41 = v0.p0;
    const s0 v25 = v34[1];
    double v36 = v10;
    const std::vector<std::vector<double>> v45 = v24.p0;
    v15[1] = v17;
    const std::vector<double> v35 = v11[2];
    std::vector<s0> v73 = v34;
    const double v60 = v2[0];
    s0 v37 = v25;
    std::vector<std::vector<double>> v51 = v45;
    const s0 v44 = v73[0];
    v15[1] = v17;
    std::vector<double> v66 = v35;
    v73 = v34;
    s0 v136 = v37;
    v136.p0 = v11;
    v15[1] = v4;
    v37.p0 = v51;
    v19[1] = v36;
    v136.p1 = v15;
    std::vector<double> v47 = v2;
    v12[2] = v14;
    std::vector<double> v99 = v14;
    const std::vector<double> v86 = v44.p1;
    v37.p0 = v51;
    const std::vector<std::vector<double>> v104 { v19, v21, v19, v15, v21 };
    v66[0] = v9;
    v37.p1 = v86;
    const std::vector<std::vector<double>> v174 { v14, v2, v66, v47, v2, v99, v14 };
    const std::vector<double> v133 = v174[4];
    v136.p0 = v41;
    const std::vector<double> v124 = v104[3];
    v37.p1 = v124;
    v7[1] = v133;
    v37.p0 = v12;
    const std::vector<double> v134 = v11[2];
    v12[0] = v134;
    v13[0] = v60;
    return v136;
  }
  s0 f63(const s0 &v0) {
    const s0 v1 = f72(v0);
    const s0 v4 = f72(v0);
    const s0 v9 = f72(v0);
    const s0 v20 = f72(v1);
    const s0 v42 = f72(v20);
    const s4 v25(v1, v9);
    const s4 v54 = f105(v25);
    s4 v73 = v54;
    const s4 v134 = f105(v73);
    s4 v81 = v73;
    v81.p1 = v9;
    const s0 v60 = v134.p1;
    v73.p0 = v60;
    v81.p1 = v60;
    const s0 v103 = v81.p1;
    v73.p0 = v42;
    v81.p1 = v4;
    return v103;
  }
  double f14(const double &v0) {
    double v1 = v0;
    double v4 = v0;
    double v6 = v0;
    double v14 = v6;
    const double v9 = v1 * v4;
    double v19 = v0;
    double v10 = v6;
    double v12 = v6;
    const std::vector<double> v17 { v14, v9 };
    v14 = v6;
    const double v21 = v17[1];
    const std::vector<double> v13 { v4, v12 };
    const double v72 = v17[1];
    const double v27 = v13[0];
    const std::vector<std::vector<double>> v67 { v17, v13 };
    std::vector<double> v36 = v13;
    std::vector<std::vector<double>> v41 = v67;
    v6 = v27;
    v36[1] = v72;
    std::vector<double> v77 = v13;
    const std::vector<std::vector<double>> v59 { v77, v13, v17, v36, v13, v36 };
    const std::vector<std::vector<double>> v45 { v36, v13, v13 };
    std::vector<double> v51 = v17;
    v41[1] = v51;
    std::vector<std::vector<double>> v66 = v41;
    v77[0] = v27;
    v51[0] = v21;
    v66[1] = v77;
    v77[1] = v6;
    v77 = v13;
    v66[1] = v77;
    v66[1] = v17;
    std::vector<std::vector<double>> v58 = v59;
    const std::vector<double> v149 = v58[0];
    std::vector<std::vector<double>> v78 = v45;
    std::vector<std::vector<double>> v39 = v67;
    const std::vector<double> v64 = v78[0];
    const double v126 = v149[0];
    v4 = v10;
    v36[0] = v19;
    v41 = v39;
    const std::vector<double> v115 = v66[1];
    v51[1] = v4;
    std::vector<double> v91 = v115;
    v41[0] = v64;
    v39[1] = v91;
    v41[0] = v64;
    v58[3] = v91;
    return v126;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v3 = f72(v0);
    const std::vector<double> v5 = v3.p1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const double v6 = f14(v1);
    const std::vector<double> v2 = v7[2];
    const double v9 = v6 - v1;
    const double v10 = v5[1];
    const s0 v4 = f63(v0);
    const std::vector<std::vector<double>> v11 = v4.p0;
    std::vector<double> v17 = v2;
    std::vector<double> v21 = v17;
    v21 = v17;
    v21[0] = v10;
    const double v27 = f14(v9);
    const double v18 = v2[0];
    std::vector<std::vector<double>> v29 = v11;
    v29[2] = v21;
    v21[0] = v27;
    v17[0] = v18;
    const double v41 = v21[0];
    const std::vector<double> v55 = v29[2];
    const double v124 = v55[0];
    v21[0] = v124;
    return v41;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0 } });
    double v1(5.0);
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
