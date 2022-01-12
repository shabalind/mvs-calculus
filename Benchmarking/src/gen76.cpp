  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f80(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<s0> v1 { v6, v0, v0, v0, v0, v6, v6 };
    const s0 v2 = v1[0];
    const s0 v4 = v1[6];
    const s0 v5 = v1[3];
    const std::vector<std::vector<double>> v3 = v2.p1;
    std::vector<std::vector<double>> v7 = v3;
    const std::vector<double> v12 = v3[0];
    std::vector<std::vector<double>> v8 = v3;
    const std::vector<s0> v9 { v4, v2, v2, v6, v0, v6 };
    const std::vector<double> v13 = v7[1];
    const std::vector<std::vector<double>> v14 = v2.p1;
    v6.p1 = v3;
    std::vector<std::vector<double>> v25 = v14;
    v6.p1 = v8;
    s0 v34 = v0;
    v6.p1 = v3;
    const s0 v11 = v1[1];
    std::vector<s0> v10 = v9;
    const std::vector<std::vector<double>> v21 = v6.p0;
    s0 v24 = v5;
    const s0 v16 = v10[5];
    v7[0] = v12;
    const s0 v36 = v9[2];
    v7[2] = v13;
    const std::vector<std::vector<std::vector<double>>> v26 { v21, v21, v21, v21, v21, v21, v21 };
    std::vector<std::vector<double>> v15 = v25;
    std::vector<double> v17 = v13;
    const std::vector<std::vector<double>> v18 = v6.p1;
    const std::vector<std::vector<double>> v19 = v16.p0;
    const std::vector<std::vector<double>> v28 = v26[4];
    v7[0] = v17;
    v25[0] = v17;
    v7[0] = v13;
    const std::vector<std::vector<double>> v43 = v26[6];
    std::vector<double> v29 = v17;
    v25[2] = v12;
    const std::vector<std::vector<double>> v23 = v26[5];
    const s0 v54 = v10[4];
    std::vector<s0> v44 = v10;
    const std::vector<std::vector<s0>> v33 { v9, v9, v10, v44 };
    v24.p0 = v43;
    const std::vector<std::vector<double>> v32 = v11.p0;
    v34.p0 = v32;
    v6.p1 = v15;
    const std::vector<std::vector<double>> v37 = v54.p0;
    const std::vector<double> v62 = v15[2];
    v34.p0 = v23;
    v6.p0 = v37;
    v24 = v2;
    v34.p0 = v19;
    v34.p0 = v28;
    const std::vector<std::vector<double>> v82 = v4.p1;
    v24.p1 = v8;
    v34.p1 = v15;
    v24.p1 = v15;
    v7 = v82;
    v7[1] = v17;
    v24.p1 = v18;
    v34.p0 = v28;
    v6 = v36;
    v10[2] = v16;
    const std::vector<std::vector<double>> v116 = v34.p0;
    std::vector<std::vector<double>> v41 = v14;
    const std::vector<std::vector<double>> v65 = v36.p0;
    v34.p0 = v23;
    v6.p0 = v65;
    v25[2] = v62;
    std::vector<std::vector<s0>> v74 = v33;
    const std::vector<s0> v53 = v74[0];
    v34 = v24;
    v34.p1 = v41;
    v41[2] = v29;
    const s0 v121 = v53[0];
    v6.p0 = v116;
    return v121;
  }
  s1 f79(const s1 &v0) {
    s1 v1 = v0;
    const s0 v4 = v0.p0;
    s1 v2 = v0;
    const s0 v3 = f80(v4);
    const s0 v7 = f80(v3);
    const s0 v5 = v2.p0;
    const s0 v8 = f80(v4);
    s1 v11 = v1;
    v11.p1 = v4;
    const s0 v15 = f80(v5);
    const std::vector<s1> v16 { v2, v11, v2, v1, v0 };
    const s1 v30 = v16[2];
    v2.p1 = v8;
    const s0 v45 = v11.p1;
    v1.p1 = v45;
    v2.p1 = v7;
    v1.p0 = v3;
    v2.p1 = v15;
    return v30;
  }
  s0 f63(const s0 &v0) {
    s0 v3 = v0;
    s0 v2 = v0;
    const std::vector<std::vector<double>> v7 = v2.p1;
    const std::vector<std::vector<double>> v4 = v3.p1;
    const std::vector<std::vector<double>> v15 = v2.p0;
    const s0 v11 = f80(v3);
    const s0 v13 = f80(v11);
    v2.p0 = v15;
    v3.p0 = v15;
    std::vector<std::vector<double>> v30 = v15;
    const s1 v59(v0, v11);
    const std::vector<std::vector<double>> v41 = v13.p1;
    v2.p1 = v4;
    v2.p0 = v30;
    const s0 v31 = v59.p1;
    const s0 v21 = f80(v31);
    const std::vector<std::vector<double>> v36 = v21.p0;
    v3.p1 = v7;
    v2.p1 = v41;
    v3.p1 = v41;
    const s0 v53 = v59.p1;
    const s1 v89 = f79(v59);
    s0 v70 = v53;
    const s1 v43 = f79(v89);
    const s0 v141 = v43.p0;
    v70.p0 = v36;
    v2 = v141;
    return v70;
  }
  s0 f46(const s0 &v0) {
    s0 v1 = v0;
    const s0 v7 = f80(v1);
    const s0 v3 = f63(v7);
    s0 v2 = v3;
    s0 v5 = v3;
    const std::vector<std::vector<double>> v8 = v7.p0;
    const std::vector<std::vector<double>> v11 = v5.p0;
    const std::vector<double> v9 = v11[0];
    v5.p0 = v8;
    const std::vector<std::vector<double>> v12 = v3.p0;
    const s1 v10(v5, v0);
    const std::vector<double> v16 = v8[1];
    const s0 v14 = v10.p1;
    v1.p0 = v12;
    const std::vector<std::vector<double>> v25 = v7.p1;
    std::vector<std::vector<double>> v34 = v25;
    v1.p0 = v8;
    s0 v21 = v2;
    std::vector<double> v32 = v9;
    const s0 v27 = f80(v14);
    const std::vector<std::vector<double>> v49 = v21.p1;
    const std::vector<std::vector<double>> v53 = v5.p0;
    const std::vector<std::vector<double>> v26 = v27.p0;
    const double v61 = v9[0];
    std::vector<std::vector<double>> v76 = v49;
    std::vector<double> v72 = v16;
    v5.p1 = v76;
    v21.p0 = v53;
    v72[0] = v61;
    v34[0] = v72;
    const std::vector<double> v47 = v11[1];
    v21.p1 = v76;
    v76[1] = v32;
    v76[1] = v47;
    const s0 v84(v26, v34);
    return v84;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s0 v5 = v0.p1;
    s0 v6 = v5;
    s0 v11 = v5;
    const s0 v9 = v0.p1;
    const s0 v8 = f46(v9);
    const std::vector<std::vector<double>> v7 = v11.p1;
    v11 = v6;
    const std::vector<double> v14 = v7[1];
    const s0 v43 = f63(v8);
    const double v13 = v14[0];
    const std::vector<std::vector<double>> v22 = v43.p1;
    std::vector<std::vector<double>> v51 = v22;
    v6.p1 = v51;
    v11.p1 = v7;
    double v29 = v13;
    v6.p1 = v7;
    return v29;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } });
    double v1(10.0);
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
