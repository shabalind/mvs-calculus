  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s1 f70(const s1 &v0) {
    const s0 v4 = v0.p1;
    const s0 v7 = v0.p1;
    const std::vector<std::vector<double>> v5 = v7.p0;
    const std::vector<double> v6 = v5[0];
    s0 v2 = v7;
    const std::vector<std::vector<double>> v10 = v7.p1;
    s1 v8 = v0;
    const std::vector<double> v13 = v10[1];
    const std::vector<std::vector<double>> v3 = v4.p1;
    const s0 v9(v5, v10, v5, v5);
    std::vector<std::vector<double>> v11 = v3;
    s1 v15 = v0;
    const double v18 = v6[0];
    std::vector<double> v36 = v13;
    double v17 = v18;
    v2.p0 = v5;
    v11[1] = v13;
    v11[1] = v13;
    v11[0] = v13;
    const std::vector<double> v117 = v5[0];
    const std::vector<double> v41 = v10[0];
    const double v14 = v17 + v17;
    const std::vector<double> v26 = v5[0];
    const double v23 = v6[0];
    v36[0] = v14;
    const std::vector<double> v29 = v3[1];
    v36 = v26;
    const s0 v27 = v15.p1;
    v11[1] = v13;
    std::vector<double> v35 = v41;
    v2.p2 = v5;
    const std::vector<std::vector<double>> v58 { v117, v35, v29, v35, v35 };
    const s0 v32 = v15.p1;
    std::vector<std::vector<double>> v44 = v5;
    std::vector<std::vector<double>> v53 = v5;
    const std::vector<double> v28 = v44[0];
    const std::vector<double> v37 = v44[0];
    v53[0] = v29;
    v15.p0 = v32;
    s1 v48 = v8;
    const std::vector<double> v73 = v58[2];
    const s0 v79 = v48.p0;
    const std::vector<std::vector<double>> v71 = v7.p0;
    v48.p0 = v9;
    v35[0] = v23;
    const s1 v67(v27, v2);
    s1 v50 = v0;
    v44[0] = v36;
    v50.p1 = v32;
    double v42 = v14;
    const s0 v47 = v48.p1;
    v36[0] = v14;
    v44[0] = v73;
    v11[0] = v73;
    std::vector<std::vector<double>> v61 = v53;
    v2 = v7;
    const std::vector<std::vector<double>> v65 = v32.p2;
    const std::vector<double> v51 = v11[0];
    v44[0] = v117;
    v61[0] = v37;
    v2.p2 = v61;
    v50.p1 = v7;
    const s0 v60 = v50.p1;
    const std::vector<std::vector<double>> v75 = v60.p1;
    const s0 v178 = v50.p1;
    const s0 v70 = v48.p1;
    const std::vector<double> v84 = v58[2];
    v36[0] = v42;
    v48.p1 = v70;
    v44[0] = v84;
    const s0 v121 = v0.p0;
    v15.p1 = v60;
    const std::vector<std::vector<double>> v43 = v47.p0;
    const std::vector<double> v96 = v58[2];
    s1 v191 = v67;
    v50 = v8;
    const std::vector<std::vector<double>> v78 = v121.p0;
    v61[0] = v51;
    v36[0] = v18;
    v61 = v43;
    v2.p3 = v71;
    v36 = v28;
    v2.p0 = v43;
    v191.p0 = v178;
    v35[0] = v18;
    v11[0] = v96;
    v15.p0 = v79;
    v191.p1 = v178;
    v50.p1 = v32;
    const s0 v243(v78, v75, v61, v65);
    v8.p0 = v243;
    return v191;
  }
  s0 f68(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v5 = v3.p2;
    const s1 v6(v3, v3);
    const s1 v1 = f70(v6);
    s1 v12 = v6;
    s1 v14 = v1;
    const std::vector<double> v7 = v5[0];
    const s1 v8 = f70(v1);
    const s1 v11 = f70(v12);
    std::vector<std::vector<double>> v4 = v5;
    v14.p0 = v0;
    v12.p1 = v3;
    std::vector<double> v17 = v7;
    const s1 v15 = f70(v11);
    const std::vector<std::vector<double>> v28 = v0.p3;
    const s1 v23 = f70(v8);
    v4[0] = v17;
    std::vector<std::vector<double>> v20 = v4;
    const s0 v18 = v23.p0;
    const s1 v31 = f70(v14);
    const std::vector<std::vector<double>> v19 = v3.p1;
    s0 v30 = v18;
    const s0 v16 = v31.p1;
    const s1 v32 = f70(v23);
    const s1 v34 = f70(v23);
    std::vector<std::vector<double>> v29 = v19;
    const s0 v40 = v32.p1;
    const std::vector<double> v35 = v28[0];
    const std::vector<s1> v52 { v15, v15, v11 };
    const double v21 = v17[0];
    v29[1] = v35;
    const double v39 = v21 / v21;
    std::vector<std::vector<double>> v123 = v5;
    const std::vector<double> v48 = v123[0];
    const std::vector<double> v38 = v19[0];
    v12.p1 = v16;
    v14.p1 = v40;
    const s1 v36 = f70(v34);
    v30.p0 = v123;
    v123[0] = v17;
    const s1 v103 = v52[2];
    const std::vector<double> v102 = v20[0];
    v12 = v36;
    const s1 v97 = v52[1];
    const double v109 = v21 - v39;
    v17[0] = v109;
    v14.p0 = v16;
    const s1 v160 = f70(v103);
    const s0 v107 = v160.p0;
    v14.p0 = v16;
    v29[1] = v48;
    v29[1] = v38;
    v12.p1 = v107;
    v3.p1 = v29;
    v123[0] = v102;
    const s0 v427 = v97.p0;
    v12.p0 = v30;
    s0 v79 = v427;
    return v79;
  }
  s1 f65(const s1 &v0) {
    const std::vector<s1> v5 { v0 };
    const s1 v4 = v5[0];
    s1 v6 = v4;
    const s1 v15 = v5[0];
    const s0 v16 = v15.p1;
    v6.p0 = v16;
    return v6;
  }
  s0 f64(const s0 &v0, const s1 &v1) {
    s0 v8 = v0;
    const s0 v20 = f68(v8);
    s0 v11 = v20;
    s0 v32 = v11;
    const s0 v41 = f68(v32);
    const std::vector<std::vector<double>> v42 = v41.p0;
    v11.p3 = v42;
    return v32;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const double v4 = v2 / v2;
    const std::vector<std::vector<double>> v7 = v1.p2;
    const s1 v8(v1, v1);
    const std::vector<double> v16 = v7[0];
    const s1 v15 = f70(v8);
    const s0 v18 = f64(v1, v15);
    double v17 = v4;
    std::vector<double> v29 = v16;
    std::vector<std::vector<double>> v19 = v7;
    const s1 v26 = f65(v8);
    v29[0] = v17;
    v19 = v7;
    const s0 v47 = v26.p1;
    const std::vector<double> v35 = v19[0];
    const std::vector<double> v20 = v19[0];
    const std::vector<std::vector<double>> v58 = v47.p1;
    v29[0] = v17;
    const std::vector<std::vector<double>> v65 = v18.p2;
    const std::vector<double> v69 = v58[1];
    const std::vector<double> v93 = v58[1];
    v29 = v35;
    v19[0] = v20;
    const double v77 = v69[0];
    v29[0] = v77;
    v19[0] = v29;
    std::vector<std::vector<double>> v60 = v65;
    std::vector<std::vector<double>> v136 = v60;
    v19[0] = v93;
    v136[0] = v29;
    v60[0] = v69;
    const std::vector<double> v64 = v136[0];
    std::vector<std::vector<double>> v131 = v19;
    const double v166 = v29[0];
    v60 = v131;
    v19[0] = v64;
    return v166;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 } } } });
    s0 v1({ { { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 } } });
    double v2(10.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
