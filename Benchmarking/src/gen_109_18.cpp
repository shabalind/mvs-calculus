  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f11(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v4 { v5, v5 };
    const std::vector<std::vector<double>> v10 = v0.p1;
    s0 v17 = v0;
    v17.p0 = v10;
    s0 v24 = v17;
    const std::vector<std::vector<double>> v31 = v17.p0;
    const std::vector<std::vector<double>> v13 = v0.p1;
    const std::vector<std::vector<double>> v26 = v24.p1;
    v17.p1 = v31;
    std::vector<std::vector<std::vector<double>>> v37 = v4;
    const std::vector<std::vector<double>> v28 = v37[1];
    v17.p0 = v28;
    v17.p1 = v13;
    const std::vector<std::vector<double>> v57 = v17.p1;
    const s0 v61(v57, v26);
    return v61;
  }
  s0 f9(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<double> v7 = v4[0];
    const std::vector<std::vector<double>> v8 = v0.p1;
    s0 v6 = v1;
    v6.p0 = v4;
    const s0 v17 = f11(v0);
    s0 v15 = v1;
    const std::vector<double> v20 = v8[0];
    s0 v14 = v17;
    const s0 v19 = f11(v14);
    const std::vector<std::vector<double>> v16 = v14.p0;
    std::vector<std::vector<double>> v24 = v8;
    s0 v29 = v0;
    const std::vector<std::vector<double>> v38 = v19.p0;
    const s0 v31(v38, v16);
    const std::vector<std::vector<double>> v28 = v15.p1;
    const s0 v25(v8, v24);
    v15.p0 = v28;
    const s0 v50 = f11(v14);
    v24[0] = v20;
    v24[0] = v7;
    const std::vector<std::vector<double>> v57 = v31.p1;
    const s0 v65 = f11(v31);
    const s0 v94 = f11(v1);
    const s0 v51 = f11(v15);
    const std::vector<std::vector<double>> v86 = v50.p1;
    const s0 v67 = f11(v94);
    const s0 v81 = f11(v29);
    const std::vector<std::vector<double>> v83 = v67.p1;
    const std::vector<std::vector<double>> v90 = v25.p1;
    const s0 v115(v83, v90);
    const s0 v79 = f11(v6);
    v14.p1 = v57;
    const std::vector<std::vector<double>> v133 = v51.p0;
    const std::vector<s0> v134 { v115, v65, v115, v81 };
    const std::vector<std::vector<double>> v147 = v79.p1;
    const s0 v173 = v134[1];
    v14.p0 = v86;
    v29.p1 = v133;
    const s0 v178 = f11(v173);
    v24 = v147;
    return v178;
  }
  s0 f8(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v5 = v6.p1;
    const std::vector<double> v1 = v5[0];
    std::vector<double> v3 = v1;
    const s0 v2 = f11(v0);
    const std::vector<double> v4 = v5[0];
    s0 v8 = v2;
    const s0 v18 = f9(v6, v0);
    std::vector<std::vector<double>> v7 = v5;
    v6.p0 = v5;
    const double v10 = v3[0];
    const std::vector<std::vector<double>> v13 = v8.p0;
    v8.p1 = v13;
    const std::vector<std::vector<double>> v9 = v0.p1;
    std::vector<std::vector<double>> v11 = v7;
    const s0 v19 = f9(v18, v8);
    const std::vector<std::vector<double>> v12 = v19.p1;
    const std::vector<std::vector<double>> v17 = v18.p1;
    std::vector<std::vector<double>> v22 = v12;
    std::vector<std::vector<double>> v28 = v7;
    v28[0] = v4;
    const double v16 = v3[0];
    v3[0] = v16;
    const std::vector<double> v35 = v17[0];
    v7[0] = v3;
    v3[0] = v10;
    v28[0] = v35;
    v22[0] = v4;
    v8.p1 = v9;
    const std::vector<double> v49 = v22[0];
    const s0 v60(v7, v28);
    v7[0] = v49;
    v8.p0 = v11;
    v6.p0 = v13;
    v6.p1 = v7;
    return v60;
  }
  s0 f7(const s0 &v0, const s0 &v1) {
    const s0 v6 = f9(v1, v1);
    const std::vector<std::vector<double>> v3 = v0.p0;
    const s0 v7 = f9(v0, v6);
    const std::vector<std::vector<double>> v2 = v1.p1;
    const s0 v11 = f8(v1);
    const s0 v13 = f11(v0);
    const s0 v12(v2, v2);
    const s0 v19 = f9(v12, v13);
    const s0 v21 = f8(v7);
    const std::vector<std::vector<double>> v38 = v19.p1;
    const s0 v30 = f9(v7, v11);
    const std::vector<std::vector<double>> v37 = v7.p1;
    const s0 v80 = f9(v21, v6);
    s0 v39 = v30;
    v39.p0 = v3;
    const std::vector<std::vector<double>> v36 = v80.p0;
    v39.p0 = v38;
    v39.p0 = v37;
    v39.p1 = v36;
    return v39;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    s0 v2 = v0;
    const s0 v8 = f9(v0, v0);
    const s0 v12 = f8(v0);
    v2.p0 = v6;
    v2.p0 = v5;
    const s0 v10 = f9(v2, v2);
    v2.p0 = v6;
    v2 = v12;
    const std::vector<std::vector<double>> v3 = v10.p0;
    const std::vector<double> v18 = v3[0];
    const s0 v14 = f11(v8);
    s0 v20 = v14;
    v20.p0 = v3;
    s0 v39 = v14;
    const std::vector<std::vector<double>> v44 = v20.p1;
    const std::vector<double> v51 = v44[0];
    const std::vector<std::vector<double>> v26 = v0.p0;
    const std::vector<std::vector<double>> v61 = v0.p1;
    const s0 v34 = f9(v12, v20);
    std::vector<std::vector<double>> v35 = v4;
    std::vector<std::vector<double>> v23 = v26;
    const std::vector<std::vector<double>> v97 = v2.p0;
    s0 v43 = v34;
    const std::vector<std::vector<std::vector<double>>> v53 { v97, v97, v44, v61, v3 };
    s0 v37 = v12;
    const std::vector<std::vector<double>> v65 = v20.p1;
    v2.p1 = v65;
    const s0 v73 = f9(v39, v37);
    const s0 v47 = f7(v12, v43);
    const std::vector<std::vector<double>> v68 = v73.p0;
    const std::vector<std::vector<double>> v78 = v47.p1;
    std::vector<std::vector<double>> v104 = v5;
    v39.p0 = v78;
    v2.p1 = v61;
    v20.p1 = v35;
    v37.p0 = v104;
    const std::vector<std::vector<double>> v127 = v53[1];
    v104[0] = v18;
    v2.p1 = v127;
    v23[0] = v51;
    v39.p1 = v23;
    const double v108 = v51[0];
    v2.p0 = v68;
    return v108;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
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
