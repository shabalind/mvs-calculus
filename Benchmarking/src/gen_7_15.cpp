  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f8(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v6 = v3.p0;
    std::vector<std::vector<double>> v4 = v6;
    const std::vector<double> v7 = v4[1];
    const std::vector<std::vector<double>> v5 = v3.p0;
    const std::vector<std::vector<double>> v1 { v7, v7 };
    v4[1] = v7;
    const double v9 = v7[0];
    v3.p0 = v6;
    const std::vector<std::vector<double>> v8 = v3.p1;
    v4[1] = v7;
    std::vector<double> v13 = v7;
    const std::vector<double> v14 = v6[0];
    const std::vector<double> v10 = v1[1];
    v3.p1 = v8;
    v4[0] = v14;
    v13[0] = v9;
    const double v20 = v7[0];
    v4 = v6;
    const double v35 = v14[0];
    const std::vector<std::vector<double>> v17 = v3.p0;
    const std::vector<std::vector<double>> v21 = v3.p1;
    const std::vector<std::vector<double>> v15 = v3.p1;
    v13[0] = v9;
    const std::vector<std::vector<double>> v19 = v3.p1;
    const std::vector<double> v25 = v19[0];
    v3.p1 = v8;
    const std::vector<std::vector<double>> v60 = v3.p0;
    v3.p0 = v1;
    v3.p0 = v60;
    v3.p0 = v17;
    const std::vector<std::vector<double>> v30 = v0.p1;
    const std::vector<double> v39 = v21[0];
    std::vector<std::vector<double>> v31 = v30;
    const double v42 = v35 * v20;
    v4[1] = v25;
    std::vector<double> v22 = v13;
    std::vector<std::vector<double>> v36 = v15;
    v3.p0 = v6;
    double v24 = v9;
    const double v34 = v35 - v9;
    const std::vector<std::vector<std::vector<double>>> v50 { v36, v15, v30, v8, v31, v31 };
    v36[0] = v10;
    v36[0] = v14;
    std::vector<std::vector<double>> v32 = v31;
    const std::vector<std::vector<double>> v112 = v50[2];
    v31 = v32;
    v3.p1 = v31;
    const double v87 = v10[0];
    const std::vector<double> v74 { v42, v24, v34, v20, v87 };
    const double v59 = v74[2];
    const s0 v57(v5, v112);
    v31[0] = v22;
    v31[0] = v39;
    v13[0] = v59;
    v3.p1 = v21;
    return v57;
  }
  s0 f6(const s0 &v0, const s0 &v1, const std::vector<s0> &v2, const s0 &v3, const std::vector<s0> &v4, const s0 &v5, const s0 &v6, const s0 &v7) {
    const std::vector<std::vector<double>> v9 = v3.p1;
    const std::vector<std::vector<double>> v16 = v3.p0;
    const std::vector<std::vector<double>> v8 = v7.p1;
    const std::vector<std::vector<double>> v23 = v5.p0;
    const s0 v28 = f8(v0);
    const std::vector<double> v31 = v23[1];
    const s0 v51 = f8(v28);
    const s0 v35(v23, v9);
    const s0 v91 = f8(v51);
    const std::vector<std::vector<double>> v76 = v35.p0;
    const s0 v60(v76, v8);
    const std::vector<std::vector<double>> v41 = v91.p1;
    std::vector<std::vector<double>> v65 = v9;
    s0 v197 = v60;
    v197.p1 = v41;
    v197.p0 = v16;
    v65[0] = v31;
    v197.p1 = v65;
    return v197;
  }
  s0 f4(const std::vector<s0> &v0, const s0 &v1, const std::vector<s0> &v2, const s0 &v3, const std::vector<s0> &v4, const s0 &v5, const std::vector<s0> &v6, const std::vector<s0> &v7) {
    std::vector<s0> v14 = v2;
    const s0 v9 = f8(v3);
    const s0 v10 = f8(v5);
    const std::vector<std::vector<double>> v8 = v10.p0;
    const std::vector<double> v15 = v8[1];
    v14[0] = v3;
    std::vector<double> v36 = v15;
    const std::vector<std::vector<double>> v23 = v1.p0;
    const s0 v18 = f8(v10);
    const s0 v19 = v6[0];
    const s0 v20 = f8(v9);
    const s0 v28 = f8(v10);
    const s0 v46 = v6[0];
    std::vector<std::vector<double>> v33 = v23;
    v14[2] = v18;
    std::vector<double> v42 = v36;
    const s0 v34 = v14[2];
    const std::vector<std::vector<double>> v31 = v28.p1;
    const std::vector<std::vector<double>> v24 = v34.p0;
    v33[0] = v15;
    const s0 v40 = f8(v19);
    s0 v25 = v40;
    v14[2] = v20;
    const std::vector<std::vector<double>> v32 = v5.p1;
    v25 = v5;
    const std::vector<std::vector<double>> v85 = v25.p1;
    std::vector<std::vector<double>> v91 = v85;
    const std::vector<std::vector<double>> v68 = v5.p1;
    const std::vector<std::vector<double>> v73 = v46.p0;
    const std::vector<std::vector<double>> v41 = v25.p0;
    v25.p1 = v32;
    v25.p1 = v68;
    v25.p0 = v73;
    const s0 v82(v24, v91);
    v91[0] = v42;
    v25.p0 = v41;
    v25.p1 = v31;
    v25.p0 = v33;
    return v82;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const s0 &v2, const std::vector<s0> &v3, const double &v4) {
    std::vector<s0> v8 = v0;
    const s0 v5 = v8[0];
    const std::vector<std::vector<double>> v9 = v5.p0;
    const s0 v10 = v3[1];
    const std::vector<std::vector<double>> v11 = v5.p0;
    const s0 v15 = v8[0];
    const std::vector<double> v6 = v11[0];
    const s0 v27 = v8[0];
    v8[0] = v15;
    const std::vector<std::vector<double>> v12 = v2.p1;
    const s0 v13 = f6(v2, v15, v0, v5, v3, v15, v5, v2);
    const s0 v30(v9, v12);
    const s0 v25 = f4(v1, v15, v3, v2, v1, v27, v1, v1);
    s0 v21 = v30;
    const std::vector<std::vector<double>> v16 = v10.p1;
    const std::vector<std::vector<double>> v40 = v13.p1;
    const double v23 = v6[0];
    const double v24 = v23 + v4;
    v21.p1 = v12;
    v21.p1 = v40;
    v21.p1 = v16;
    const std::vector<std::vector<double>> v43 = v25.p1;
    v21.p1 = v43;
    v21.p0 = v11;
    v21.p1 = v43;
    v8[0] = v21;
    return v24;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } } });
    std::vector<s0> v1({ { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } });
    s0 v2({ { { 9.0 }, { 10.0 } }, { { 11.0 } } });
    std::vector<s0> v3({ { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } });
    double v4(21.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
