  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f52(const s0 &v0, const s0 &v1) {
    s0 v3 = v0;
    v3 = v0;
    const std::vector<std::vector<double>> v4 = v3.p0;
    v3.p1 = v4;
    const s0 v2(v4, v4);
    const std::vector<std::vector<double>> v6 = v1.p1;
    v3.p1 = v6;
    v3.p1 = v6;
    return v2;
  }
  s0 f49(const s0 &v0) {
    s0 v2 = v0;
    s0 v9 = v2;
    const std::vector<std::vector<double>> v4 = v2.p1;
    std::vector<std::vector<double>> v7 = v4;
    const std::vector<double> v1 = v7[0];
    const std::vector<std::vector<double>> v3 = v2.p1;
    const std::vector<double> v8 = v7[1];
    v7[0] = v1;
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<double> v13 = v7[0];
    s0 v6 = v0;
    const s0 v18 = f52(v0, v9);
    std::vector<std::vector<double>> v14 = v4;
    v7[1] = v13;
    std::vector<std::vector<double>> v12 = v7;
    const std::vector<std::vector<double>> v20 = v0.p1;
    const s0 v29 = f52(v0, v9);
    v6.p0 = v7;
    v12[1] = v1;
    const s0 v25 = f52(v18, v29);
    const std::vector<double> v15 = v5[1];
    const s0 v10 = f52(v2, v25);
    v7 = v3;
    s0 v43 = v10;
    const std::vector<std::vector<double>> v36 = v10.p1;
    v14[0] = v13;
    const std::vector<double> v19 = v12[0];
    v6.p1 = v36;
    const s0 v17 = f52(v2, v6);
    const std::vector<std::vector<double>> v27 { v19, v8, v13 };
    const s0 v26 = f52(v43, v6);
    const std::vector<std::vector<double>> v30 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v34 { v27, v27 };
    const std::vector<std::vector<double>> v22 = v34[1];
    const std::vector<std::vector<double>> v56 = v17.p1;
    s0 v49 = v25;
    const s0 v37(v20, v14);
    v2 = v0;
    v9 = v10;
    const s0 v80 = f52(v25, v26);
    const std::vector<double> v62 = v22[2];
    v43.p1 = v30;
    const s0 v39 = f52(v18, v49);
    v49.p1 = v7;
    const std::vector<std::vector<double>> v83 = v2.p0;
    const s0 v137 = f52(v37, v80);
    v12[1] = v15;
    v12[1] = v19;
    const std::vector<double> v99 = v27[2];
    const std::vector<double> v91 = v27[0];
    v7[0] = v13;
    const std::vector<std::vector<double>> v124 = v9.p1;
    v7[1] = v62;
    v14 = v56;
    v12[1] = v99;
    v49.p0 = v83;
    const s0 v86 = f52(v39, v137);
    v9.p1 = v124;
    const std::vector<std::vector<double>> v211 = v0.p0;
    v12[0] = v91;
    v49.p1 = v211;
    return v86;
  }
  s0 f48(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const s0 v4 = f49(v5);
    const s0 v2 = f49(v4);
    v5.p1 = v1;
    const s0 v12 = f52(v0, v0);
    const s0 v11 = f52(v0, v5);
    std::vector<std::vector<double>> v10 = v1;
    const std::vector<std::vector<double>> v15 = v12.p0;
    const std::vector<s0> v30 { v0 };
    const s0 v20 = f52(v2, v0);
    const std::vector<std::vector<double>> v26 = v12.p1;
    const s0 v31 = f49(v12);
    const s0 v38 = f49(v4);
    const s0 v16(v15, v15);
    const std::vector<std::vector<double>> v44 = v5.p1;
    v5.p0 = v10;
    std::vector<s0> v47 = v30;
    std::vector<std::vector<double>> v78 = v1;
    const s0 v32 = f49(v20);
    v5 = v4;
    const std::vector<std::vector<double>> v43 = v31.p1;
    const std::vector<std::vector<std::vector<double>>> v56 { v78, v10, v26, v26, v10 };
    const std::vector<std::vector<double>> v41 = v38.p0;
    const std::vector<std::vector<double>> v45 = v56[1];
    const s0 v51 = f52(v20, v2);
    v5.p0 = v44;
    std::vector<std::vector<double>> v98 = v43;
    v5.p0 = v98;
    v5.p1 = v98;
    const s0 v66 = v47[0];
    const s0 v63 = f52(v66, v51);
    const s0 v91 = f52(v32, v16);
    const s0 v112 = f52(v11, v63);
    v47[0] = v2;
    const std::vector<std::vector<double>> v159 = v2.p1;
    const std::vector<double> v93 = v45[0];
    v5.p0 = v159;
    v5.p0 = v15;
    const std::vector<std::vector<double>> v113 = v91.p1;
    v10[0] = v93;
    s0 v153 = v112;
    const std::vector<double> v188 = v113[0];
    v153.p0 = v41;
    v10[0] = v188;
    return v153;
  }
  s0 f44(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p0;
    std::vector<std::vector<double>> v2 = v6;
    const s0 v10 = f52(v0, v0);
    const s0 v8 = f48(v10);
    const std::vector<double> v1 = v3[1];
    std::vector<double> v11 = v1;
    const s0 v19(v2, v2);
    const std::vector<std::vector<double>> v26 = v0.p0;
    const s0 v16 = f49(v8);
    v2[1] = v11;
    v2 = v26;
    const s0 v48 = f52(v19, v16);
    v2[1] = v11;
    v2[1] = v1;
    const s0 v23 = f49(v48);
    std::vector<double> v53 = v11;
    v2[1] = v53;
    return v23;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v3 = v0[0];
    const s0 v2 = f44(v3);
    const std::vector<std::vector<double>> v9 = v2.p0;
    const std::vector<double> v6 = v9[1];
    const double v21 = v6[0];
    return v21;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } });
    double v1(12.0);
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
