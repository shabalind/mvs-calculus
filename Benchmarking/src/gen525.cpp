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
  struct s2 {
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s2(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s1 f80(const s1 &v0) {
    const s0 v5 = v0.p1;
    const std::vector<std::vector<double>> v1 = v5.p0;
    s0 v7 = v5;
    s1 v4 = v0;
    std::vector<std::vector<double>> v12 = v1;
    const std::vector<std::vector<double>> v9 = v7.p0;
    std::vector<std::vector<double>> v2 = v9;
    const std::vector<std::vector<double>> v11 = v7.p0;
    v7.p0 = v12;
    s1 v16 = v0;
    const std::vector<double> v18 = v11[0];
    v12[0] = v18;
    const s0 v20 = v4.p0;
    s1 v29 = v4;
    const std::vector<double> v19 = v12[0];
    s1 v13 = v0;
    s0 v22 = v20;
    const s0 v36 = v13.p0;
    const s0 v23 = v29.p1;
    const s0 v24 = v29.p1;
    const std::vector<std::vector<double>> v14 = v36.p1;
    const std::vector<std::vector<double>> v31 = v24.p1;
    v12[0] = v19;
    std::vector<std::vector<double>> v68 = v31;
    const std::vector<double> v25 = v14[1];
    const s0 v30(v2, v68);
    const double v28 = v18[0];
    v13.p0 = v22;
    const std::vector<double> v57 = v14[0];
    std::vector<double> v37 = v57;
    const std::vector<double> v59 = v1[0];
    v37[0] = v28;
    const s0 v38 = v16.p0;
    v68[1] = v37;
    v29.p0 = v38;
    v13.p0 = v36;
    const s0 v51 = v4.p1;
    v7.p1 = v31;
    const s0 v77 = v4.p1;
    v4.p0 = v77;
    v68[1] = v59;
    v4.p0 = v23;
    v2[0] = v25;
    const s1 v97(v30, v51);
    return v97;
  }
  s2 f79(const s2 &v0) {
    const s0 v1 = v0.p0;
    const s0 v9 = v0.p0;
    s0 v12 = v1;
    s2 v10 = v0;
    s2 v17 = v10;
    const std::vector<std::vector<double>> v15 = v9.p1;
    v10.p0 = v12;
    v10 = v17;
    const std::vector<s2> v16 { v10, v17 };
    const s2 v23 = v16[0];
    const s2 v33 = v16[0];
    s0 v45 = v12;
    const s1 v27(v9, v45);
    const s1 v84 = f80(v27);
    const s1 v115 = f80(v27);
    const s0 v39 = v84.p0;
    v12.p1 = v15;
    const s0 v46 = v115.p1;
    const std::vector<std::vector<double>> v165 = v46.p0;
    const s0 v107 = v23.p0;
    v10.p0 = v39;
    v12.p0 = v165;
    v17.p0 = v107;
    return v33;
  }
  s0 f73(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v4 = v7.p0;
    const std::vector<s0> v6 { v7, v0 };
    s0 v5 = v0;
    const std::vector<std::vector<double>> v2 = v5.p1;
    v7 = v0;
    const std::vector<std::vector<double>> v1 = v7.p0;
    std::vector<std::vector<double>> v14 = v2;
    const std::vector<double> v13 = v1[0];
    v14 = v2;
    v7.p1 = v14;
    s0 v11 = v7;
    const std::vector<double> v18 = v1[0];
    v14[0] = v18;
    const std::vector<std::vector<double>> v8 = v11.p1;
    v11.p1 = v8;
    const std::vector<double> v12 = v14[0];
    const std::vector<std::vector<double>> v9 = v11.p1;
    v14[2] = v12;
    v5.p1 = v9;
    const std::vector<std::vector<double>> v19 = v7.p1;
    const std::vector<std::vector<double>> v15 = v11.p0;
    v7.p1 = v19;
    const std::vector<double> v20 = v2[2];
    std::vector<std::vector<double>> v17 = v4;
    v5.p1 = v2;
    std::vector<std::vector<double>> v10 = v17;
    v7.p0 = v10;
    std::vector<std::vector<double>> v33 = v9;
    const std::vector<std::vector<double>> v26 = v5.p1;
    const std::vector<std::vector<double>> v23 = v5.p1;
    const s0 v24 = v6[0];
    v10[0] = v13;
    v11.p0 = v15;
    v17[0] = v20;
    v11.p0 = v4;
    const std::vector<double> v42 = v33[0];
    const s0 v34 = v6[0];
    v10[0] = v13;
    v11.p0 = v10;
    v17[0] = v20;
    v33 = v19;
    v5 = v24;
    v11.p1 = v23;
    const std::vector<double> v54 = v9[0];
    v5.p1 = v8;
    s0 v102 = v24;
    const std::vector<std::vector<double>> v116 = v0.p1;
    const std::vector<std::vector<double>> v57 = v34.p0;
    v14[0] = v42;
    v7.p1 = v2;
    const std::vector<std::vector<double>> v47 = v5.p1;
    s0 v44 = v102;
    v14[0] = v54;
    std::vector<std::vector<double>> v101 = v26;
    v7.p1 = v101;
    v10[0] = v42;
    v44.p1 = v116;
    v102.p1 = v9;
    v102.p0 = v15;
    v7.p1 = v47;
    v44.p0 = v57;
    return v44;
  }
  s2 f54(const s2 &v0, const std::vector<s1> &v1) {
    const s0 v11 = v0.p0;
    s2 v18 = v0;
    s0 v28 = v11;
    v18.p0 = v28;
    return v18;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s2 v3 = f79(v0);
    const std::vector<std::vector<s1>> v7 = v0.p1;
    const std::vector<s1> v9 = v7[0];
    const s0 v12 = v0.p0;
    s0 v14 = v12;
    const s2 v11 = f54(v3, v9);
    const s0 v17 = f73(v14);
    v14 = v12;
    const std::vector<std::vector<double>> v32 = v17.p0;
    const std::vector<double> v29 = v32[0];
    const std::vector<std::vector<double>> v36 = v14.p1;
    const double v53 = v29[0];
    s0 v52 = v12;
    const std::vector<std::vector<double>> v45 = v17.p1;
    v14.p1 = v45;
    v52.p1 = v36;
    const s0 v69 = v11.p0;
    v14 = v52;
    v52.p1 = v36;
    const std::vector<std::vector<double>> v61 = v69.p1;
    v52.p1 = v61;
    v52.p1 = v61;
    return v53;
  }
  int main() {
    s2 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } } } });
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
