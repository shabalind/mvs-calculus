  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<s0>> f18(const s0 &v0, const std::vector<std::vector<s0>> &v1) {
    std::vector<std::vector<s0>> v44 = v1;
    std::vector<std::vector<s0>> v98 = v44;
    return v98;
  }
  double f17(const double &v0) {
    double v6 = v0;
    const std::vector<double> v5 { v0, v0, v6, v6, v0, v0, v6 };
    const double v1 = v5[6];
    double v8 = v6;
    const double v12 = v5[5];
    double v7 = v1;
    std::vector<double> v3 = v5;
    const double v9 = v3[2];
    v6 = v9;
    const double v4 = v3[0];
    const double v11 = v5[2];
    const double v16 = v5[1];
    double v20 = v16;
    const double v19 = v5[1];
    const double v30 = v5[0];
    std::vector<double> v21 = v5;
    v21[5] = v1;
    v21[4] = v30;
    std::vector<double> v14 = v3;
    v3[3] = v11;
    const double v25 = v14[2];
    const std::vector<double> v28 { v8, v16, v4, v6, v7 };
    v21[1] = v19;
    v14[4] = v12;
    v21[1] = v11;
    v21[1] = v9;
    v3 = v21;
    const std::vector<std::vector<double>> v46 { v28, v28, v28, v28, v28, v28, v28 };
    v21[0] = v6;
    std::vector<std::vector<double>> v37 = v46;
    v14[5] = v20;
    const std::vector<double> v52 = v37[2];
    std::vector<double> v53 = v52;
    v20 = v11;
    v53[4] = v30;
    v3[5] = v25;
    const double v98 = v53[2];
    return v98;
  }
  s0 f16(const s0 &v0) {
    s0 v5 = v0;
    v5 = v0;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v1 = v5.p1;
    v5.p0 = v4;
    const s0 v8(v4, v1);
    std::vector<std::vector<double>> v23 = v4;
    v5.p0 = v23;
    const std::vector<s0> v9 { v5, v0, v0, v5, v8, v5 };
    std::vector<s0> v31 = v9;
    const s0 v48 = v31[0];
    return v48;
  }
  s0 f15(const s0 &v0, const std::vector<std::vector<s0>> &v1) {
    const s0 v5 = f16(v0);
    const std::vector<std::vector<s0>> v32 = f18(v5, v1);
    const s0 v23 = f16(v0);
    const std::vector<std::vector<s0>> v34 = f18(v23, v32);
    const std::vector<s0> v74 = v34[1];
    const s0 v138 = v74[0];
    return v138;
  }
  s0 f9(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<s0> v10 { v5 };
    s0 v6 = v5;
    const s0 v4 = f16(v6);
    const s0 v2 = f16(v4);
    const std::vector<std::vector<s0>> v18 { v10, v10, v10 };
    std::vector<std::vector<s0>> v23 = v18;
    const s0 v54 = f15(v2, v23);
    return v54;
  }
  double f5(const s0 &v0, const double &v1, const s0 &v2, const s0 &v3, const s0 &v4) {
    const std::vector<std::vector<double>> v7 = v4.p1;
    const std::vector<std::vector<double>> v6 = v2.p1;
    const s0 v5(v6, v7);
    s0 v15 = v3;
    v15.p0 = v6;
    const std::vector<double> v8 = v6[0];
    const std::vector<double> v10 = v6[0];
    const std::vector<double> v14 = v7[0];
    v15.p0 = v7;
    const double v21 = f17(v1);
    const s0 v20 = f9(v15);
    std::vector<std::vector<double>> v18 = v7;
    std::vector<double> v29 = v8;
    v18[0] = v14;
    std::vector<double> v23 = v10;
    v23[0] = v21;
    const s0 v33 = f16(v20);
    const std::vector<std::vector<double>> v34 = v20.p1;
    const double v16 = v23[0];
    const std::vector<std::vector<double>> v36 = v15.p1;
    v15.p0 = v7;
    std::vector<std::vector<double>> v24 = v36;
    const std::vector<std::vector<double>> v27 = v5.p1;
    const std::vector<double> v59 = v27[0];
    const std::vector<std::vector<double>> v88 = v33.p1;
    v15.p1 = v34;
    v23[0] = v16;
    const s0 v57 = f9(v3);
    const std::vector<double> v99 = v88[0];
    const std::vector<std::vector<double>> v71 = v57.p0;
    v18[0] = v59;
    const double v62 = v99[0];
    v29[0] = v16;
    v15.p1 = v24;
    v18 = v71;
    std::vector<double> v121 = v29;
    const double v58 = v16 / v62;
    v15.p0 = v18;
    v23 = v121;
    return v58;
  }
  s0 f4(const s0 &v0, const s0 &v1) {
    s0 v2 = v0;
    const s0 v4 = f9(v2);
    s0 v7 = v0;
    const s0 v5 = f9(v4);
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v13 = v5.p1;
    const s0 v6 = f9(v7);
    const std::vector<double> v9 = v13[0];
    const s0 v15 = f16(v4);
    const s0 v10 = f16(v5);
    const s0 v20 = f16(v6);
    const s0 v8 = f9(v0);
    const std::vector<std::vector<double>> v25 = v4.p1;
    std::vector<std::vector<double>> v18 = v3;
    v7.p0 = v3;
    const std::vector<std::vector<double>> v21 = v4.p1;
    const double v17 = v9[0];
    v7.p1 = v18;
    const std::vector<std::vector<double>> v37 = v20.p1;
    const std::vector<std::vector<double>> v34 = v10.p1;
    v2.p0 = v34;
    v2.p1 = v18;
    const std::vector<std::vector<double>> v22 = v15.p1;
    const std::vector<double> v32 = v34[0];
    std::vector<std::vector<double>> v40 = v25;
    v7.p1 = v40;
    const std::vector<double> v53 = v3[0];
    const std::vector<double> v31 = v22[0];
    v40[0] = v53;
    v18[0] = v31;
    v2.p1 = v25;
    v40[0] = v9;
    const s0 v67 = f16(v2);
    v40[0] = v53;
    v18[0] = v32;
    v18[0] = v32;
    std::vector<double> v23 = v32;
    v18[0] = v32;
    const std::vector<std::vector<double>> v24 = v20.p0;
    const s0 v47(v21, v13);
    const double v48 = v9[0];
    v18[0] = v9;
    s0 v84 = v8;
    v18[0] = v23;
    v84.p0 = v37;
    const s0 v30 = f9(v47);
    v18[0] = v31;
    v23[0] = v48;
    v84 = v30;
    v7.p1 = v24;
    v84.p1 = v21;
    const double v42 = f17(v17);
    v84.p0 = v21;
    v7.p1 = v37;
    const std::vector<std::vector<double>> v60 = v67.p0;
    const std::vector<std::vector<double>> v125 = v7.p0;
    v84.p1 = v125;
    v2.p1 = v60;
    v23[0] = v42;
    v84.p1 = v40;
    v2.p0 = v40;
    const std::vector<std::vector<double>> v143 = v47.p0;
    const std::vector<double> v183 = v143[0];
    v18[0] = v183;
    return v84;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v5 = v1.p1;
    const s0 v9 = f9(v1);
    const std::vector<double> v7 = v5[0];
    const s0 v11 = f4(v0, v0);
    const double v48 = v7[0];
    const s0 v41 = f4(v9, v9);
    const double v24 = f5(v1, v48, v1, v0, v41);
    const double v27 = v7[0];
    const s0 v42 = f9(v0);
    const double v47 = f17(v24);
    const double v59 = f5(v11, v27, v9, v42, v1);
    double v71 = v59;
    double v75 = v47;
    const double v79 = v71 + v75;
    return v79;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    s0 v1({ { { 2.0 } }, { { 3.0 } } });
    double v2(4.0);
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
