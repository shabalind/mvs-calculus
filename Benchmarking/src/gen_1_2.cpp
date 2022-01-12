  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  s1 f55(const s1 &v0) {
    const std::vector<s0> v6 = v0.p1;
    const s0 v1 = v6[2];
    s0 v4 = v1;
    s0 v3 = v4;
    const s0 v2 = v6[2];
    const s0 v7 = v6[0];
    s1 v9 = v0;
    std::vector<s0> v8 = v6;
    v8[1] = v3;
    v8 = v6;
    v9.p1 = v8;
    v9.p1 = v8;
    v8[1] = v7;
    const s0 v11 = v8[0];
    std::vector<s0> v15 = v6;
    const std::vector<std::vector<s0>> v22 = v9.p0;
    s1 v10 = v0;
    v8[2] = v2;
    const std::vector<std::vector<s0>> v27 = v10.p0;
    const std::vector<s0> v19 = v0.p1;
    v9.p1 = v15;
    s1 v33 = v0;
    v8[2] = v1;
    std::vector<std::vector<s0>> v30 = v22;
    std::vector<std::vector<s0>> v17 = v30;
    v10.p0 = v27;
    v15[2] = v11;
    v9.p1 = v19;
    const std::vector<std::vector<s0>> v43 = v10.p0;
    const std::vector<s0> v56 = v9.p1;
    s1 v54 = v33;
    v10.p0 = v30;
    const std::vector<s0> v93 = v54.p1;
    v9 = v10;
    v10.p1 = v15;
    std::vector<std::vector<s0>> v58 = v22;
    s1 v128 = v33;
    s1 v100 = v128;
    const std::vector<s0> v92 = v0.p1;
    std::vector<s0> v95 = v93;
    s1 v82 = v100;
    v8 = v92;
    v100.p0 = v58;
    v58 = v17;
    v128.p1 = v56;
    v95[1] = v2;
    v10.p1 = v95;
    v9.p0 = v43;
    std::vector<std::vector<s0>> v187 = v30;
    v54.p0 = v187;
    return v82;
  }
  s0 f40(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    s0 v1 = v0;
    v1.p0 = v5;
    s0 v3 = v0;
    s0 v8 = v3;
    v3.p1 = v5;
    const std::vector<std::vector<double>> v4 = v3.p0;
    v8.p0 = v4;
    const std::vector<std::vector<double>> v16 = v3.p0;
    const std::vector<s0> v12 { v0, v0, v1, v3, v8, v3 };
    const std::vector<std::vector<double>> v20 = v8.p0;
    const std::vector<s0> v13 { v3, v1 };
    const std::vector<std::vector<double>> v22 = v3.p1;
    std::vector<s0> v23 = v13;
    const std::vector<std::vector<double>> v21 = v3.p0;
    v1.p0 = v16;
    v3.p1 = v22;
    const std::vector<std::vector<double>> v31 = v1.p0;
    v23[1] = v8;
    v23[1] = v0;
    std::vector<std::vector<double>> v36 = v31;
    v8.p1 = v22;
    std::vector<s0> v33 = v12;
    const s0 v58 = v23[0];
    v8.p1 = v21;
    v3 = v58;
    s0 v60 = v8;
    v1.p1 = v36;
    std::vector<s0> v70 = v33;
    const std::vector<std::vector<double>> v83 = v60.p0;
    v1.p0 = v83;
    const s0 v85 = v70[2];
    v3.p1 = v20;
    return v85;
  }
  s1 f25(const s1 &v0) {
    const s1 v3 = f55(v0);
    s1 v8 = v0;
    const std::vector<s0> v10 = v3.p1;
    v8.p1 = v10;
    v8.p1 = v10;
    v8.p1 = v10;
    const s1 v17 = f55(v8);
    return v17;
  }
  s0 f2(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v5 = v4[1];
    const s0 v14 = f40(v0);
    const s0 v6 = f40(v14);
    s0 v1 = v0;
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const s0 v16 = f40(v1);
    const std::vector<std::vector<double>> v15 = v14.p1;
    v1 = v14;
    std::vector<std::vector<double>> v22 = v7;
    const std::vector<std::vector<double>> v21 = v14.p1;
    v1.p1 = v8;
    const s0 v45 = f40(v1);
    v22 = v15;
    const s0 v25 = f40(v16);
    const std::vector<std::vector<double>> v39 = v1.p0;
    const std::vector<std::vector<double>> v33 = v0.p0;
    std::vector<std::vector<double>> v53 = v39;
    v53[2] = v5;
    const s0 v42 = f40(v25);
    const s0 v68 = f40(v42);
    s0 v37 = v68;
    const std::vector<double> v80 = v33[0];
    const std::vector<std::vector<double>> v51 = v1.p1;
    v53[1] = v80;
    v1.p0 = v33;
    const std::vector<std::vector<double>> v49 = v45.p0;
    const std::vector<std::vector<double>> v81 = v16.p1;
    const std::vector<std::vector<double>> v230 = v6.p1;
    v22[0] = v5;
    v1.p1 = v15;
    v1.p0 = v33;
    v1.p1 = v11;
    v37.p0 = v22;
    v37.p1 = v49;
    v1.p0 = v53;
    v37.p1 = v22;
    v37.p0 = v81;
    v1.p1 = v230;
    v1.p0 = v51;
    v37.p1 = v81;
    std::vector<std::vector<double>> v108 = v21;
    v37.p1 = v108;
    const s0 v106 = f40(v37);
    v37.p0 = v4;
    v37.p0 = v39;
    return v106;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s1 v4 = v0.p0;
    const s1 v5 = f25(v4);
    const std::vector<s0> v12 = v5.p1;
    std::vector<s0> v3 = v12;
    const s0 v18 = v3[1];
    const s0 v17 = f2(v18);
    v3[0] = v17;
    const std::vector<std::vector<double>> v25 = v17.p0;
    const std::vector<std::vector<double>> v15 = v18.p1;
    const s0 v24 = v12[0];
    const s0 v30(v25, v15);
    const std::vector<double> v29 = v25[1];
    v3[2] = v24;
    const std::vector<std::vector<double>> v77 = v30.p0;
    const std::vector<double> v99 = v77[0];
    const double v165 = v29[0];
    const double v196 = v99[0];
    const double v97 = v165 * v1;
    double v154 = v97;
    const double v80 = v1 + v196;
    const double v173 = v80 / v154;
    return v173;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } });
    double v1(24.0);
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
