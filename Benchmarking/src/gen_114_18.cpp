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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    s1 p1;
    s2(std::vector<std::vector<s1>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f35(const s0 &v0) {
    s0 v8 = v0;
    s0 v6 = v8;
    return v6;
  }
  double f30(const double &v0, const s0 &v1, const std::vector<s1> &v2) {
    const s0 v4 = f35(v1);
    const std::vector<std::vector<double>> v9 = v4.p1;
    const std::vector<double> v57 = v9[1];
    std::vector<double> v62 = v57;
    const double v136 = v62[0];
    return v136;
  }
  s0 f26(const s0 &v0, const s0 &v1, const s1 &v2, const s2 &v3) {
    const s0 v8 = f35(v1);
    s1 v10 = v2;
    const s0 v7 = f35(v0);
    const s0 v5 = f35(v1);
    const std::vector<std::vector<s0>> v13 = v10.p1;
    v10.p1 = v13;
    const s0 v12 = f35(v7);
    const s0 v9 = f35(v5);
    const std::vector<s0> v15 = v13[0];
    std::vector<s0> v11 = v15;
    const s0 v14 = f35(v1);
    s1 v17 = v2;
    s0 v22 = v1;
    const std::vector<std::vector<double>> v20 = v5.p0;
    const std::vector<s0> v49 = v13[0];
    v22.p0 = v20;
    const s0 v21 = f35(v14);
    s1 v26 = v17;
    std::vector<s0> v42 = v15;
    v10.p0 = v8;
    const std::vector<s0> v36 = v13[0];
    const std::vector<std::vector<double>> v29 = v12.p1;
    const std::vector<std::vector<double>> v30 = v0.p0;
    v11[0] = v21;
    v42[0] = v9;
    const s0 v33 = f35(v7);
    v42[0] = v1;
    std::vector<std::vector<s0>> v44 = v13;
    std::vector<s0> v48 = v36;
    v10.p1 = v13;
    const s0 v37 = v26.p0;
    v17.p1 = v13;
    const std::vector<std::vector<s0>> v28 = v10.p1;
    const s0 v60 = v2.p0;
    const std::vector<std::vector<s0>> v53 = v17.p1;
    v44[0] = v11;
    const s0 v47 = f35(v12);
    v42[0] = v22;
    std::vector<std::vector<double>> v55 = v29;
    v42[0] = v60;
    s0 v45 = v37;
    v44 = v53;
    const s0 v97 = v17.p0;
    v26.p1 = v28;
    const std::vector<std::vector<double>> v65 = v12.p0;
    v44[0] = v42;
    v45.p0 = v30;
    const s0 v143(v65, v55);
    v48[0] = v12;
    v11[0] = v14;
    const s0 v56 = f35(v21);
    v42[0] = v7;
    const std::vector<std::vector<double>> v118 = v7.p1;
    v44[0] = v49;
    std::vector<std::vector<double>> v133 = v118;
    const std::vector<s0> v76 { v143, v97, v37, v8, v45, v56 };
    v11[0] = v33;
    const s0 v68 = v76[2];
    v22.p1 = v55;
    v44[0] = v48;
    v17.p0 = v47;
    v10.p1 = v44;
    v45.p1 = v133;
    const std::vector<std::vector<double>> v153 = v0.p1;
    v45.p1 = v153;
    return v68;
  }
  s2 f17(const s2 &v0) {
    const s1 v9 = v0.p1;
    const s0 v4 = v9.p0;
    const s0 v7 = f26(v4, v4, v9, v0);
    const std::vector<std::vector<s0>> v5 = v9.p1;
    const std::vector<s0> v13 = v5[0];
    const std::vector<s0> v8 = v5[0];
    const s0 v10 = v9.p0;
    std::vector<s0> v24 = v8;
    std::vector<std::vector<s0>> v26 = v5;
    std::vector<std::vector<s0>> v25 = v26;
    const std::vector<std::vector<s1>> v52 = v0.p0;
    v24[0] = v7;
    v24[0] = v10;
    v26 = v25;
    s1 v40 = v9;
    v25[0] = v13;
    v40.p1 = v26;
    v25[0] = v24;
    s2 v69 = v0;
    v69.p0 = v52;
    v69.p1 = v40;
    return v69;
  }
  s2 f11(const s2 &v0) {
    const s2 v3 = f17(v0);
    const s2 v2 = f17(v3);
    return v2;
  }
  s0 f6(const s0 &v0) {
    const s0 v7 = f35(v0);
    s0 v1 = v7;
    s0 v2 = v1;
    const std::vector<std::vector<double>> v5 = v7.p1;
    const s0 v6 = f35(v1);
    const s0 v4 = f35(v2);
    std::vector<std::vector<double>> v9 = v5;
    const std::vector<double> v11 = v9[0];
    const std::vector<std::vector<double>> v13 = v6.p0;
    v2.p0 = v13;
    const std::vector<std::vector<double>> v10 = v2.p1;
    v1.p1 = v9;
    const std::vector<std::vector<std::vector<double>>> v12 { v9, v9, v5, v5, v5, v10, v10 };
    v2.p1 = v5;
    const std::vector<std::vector<double>> v34 = v0.p0;
    const std::vector<std::vector<double>> v32 = v12[0];
    const std::vector<double> v20 = v34[1];
    const std::vector<std::vector<double>> v27 = v2.p0;
    v1.p0 = v27;
    v2.p1 = v32;
    v9[1] = v11;
    v9[0] = v20;
    v9[1] = v11;
    const s0 v41 = f35(v4);
    v2.p1 = v32;
    const std::vector<std::vector<double>> v59 = v12[0];
    v2.p0 = v34;
    const std::vector<double> v64 = v9[0];
    v9[1] = v64;
    v2.p1 = v5;
    v1 = v2;
    v1.p1 = v59;
    const s0 v142 = f35(v41);
    return v142;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v5 = v0;
    s2 v2 = v0;
    const s2 v4 = f11(v5);
    const s1 v8 = v5.p1;
    const s2 v6 = f17(v0);
    const s0 v13 = v8.p0;
    s2 v9 = v2;
    const std::vector<std::vector<s0>> v11 = v8.p1;
    const s1 v3 = v6.p1;
    v2 = v5;
    const std::vector<s0> v12 = v11[0];
    v2.p1 = v3;
    const double v16 = v1 + v1;
    v2.p1 = v3;
    const s0 v18 = v12[0];
    const std::vector<std::vector<s1>> v26 = v9.p0;
    const s2 v17 = f11(v9);
    const std::vector<s1> v20 = v26[0];
    s0 v25 = v13;
    const double v19 = v1 - v16;
    const s0 v28 = f26(v13, v25, v3, v17);
    const s0 v32 = v8.p0;
    const double v27 = v1 / v19;
    const s0 v46 = f6(v13);
    const s0 v33 = v12[0];
    const std::vector<std::vector<double>> v31 = v32.p0;
    const s0 v64 = f26(v33, v18, v8, v5);
    v25.p0 = v31;
    const std::vector<std::vector<s1>> v42 = v4.p0;
    const std::vector<s1> v84 = v42[0];
    v2.p0 = v26;
    const s1 v61 = v84[0];
    std::vector<std::vector<s1>> v69 = v42;
    const double v113 = f30(v1, v28, v20);
    const double v83 = v113 * v27;
    const std::vector<s1> v63 = v69[0];
    v9.p1 = v61;
    v69[0] = v63;
    const s0 v94 = f26(v64, v46, v8, v6);
    const double v75 = f30(v83, v94, v63);
    return v75;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } } } });
    double v1(20.0);
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
