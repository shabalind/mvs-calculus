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
  s0 f85(const s0 &v0, const std::vector<double> &v1) {
    const s1 v17(v0, v0);
    s0 v33 = v0;
    s1 v32 = v17;
    v32.p1 = v33;
    const s0 v18 = v32.p0;
    return v18;
  }
  s1 f83(const s1 &v0, const s0 &v1) {
    const std::vector<s1> v3 { v0, v0, v0, v0, v0, v0 };
    const s1 v7 = v3[0];
    const s0 v4 = v7.p1;
    const s1 v5 = v3[4];
    const s0 v8 = v5.p1;
    const std::vector<std::vector<double>> v10 = v4.p0;
    std::vector<s1> v2 = v3;
    std::vector<s1> v15 = v2;
    const std::vector<double> v9 = v10[1];
    v2 = v15;
    const s0 v12 = f85(v1, v9);
    v2[3] = v5;
    const s1 v24 = v15[0];
    const s0 v22 = f85(v12, v9);
    const s1 v23 = v15[0];
    v2[4] = v24;
    const std::vector<std::vector<double>> v45 = v1.p1;
    s1 v33 = v23;
    v33.p0 = v1;
    v2[0] = v24;
    v15[1] = v5;
    v33.p0 = v12;
    const std::vector<std::vector<double>> v29 = v1.p0;
    const std::vector<double> v48 = v29[1];
    const s1 v50 = v3[2];
    const s0 v70 = f85(v22, v48);
    const std::vector<double> v63 = v45[0];
    s0 v43 = v8;
    const s0 v44 = f85(v70, v63);
    const std::vector<std::vector<double>> v140 = v44.p0;
    s1 v80 = v24;
    v2 = v3;
    v80.p0 = v70;
    v15[2] = v23;
    v15[5] = v50;
    const std::vector<std::vector<double>> v111 = v44.p1;
    v15[4] = v33;
    v43.p1 = v111;
    v80.p1 = v43;
    v43.p0 = v140;
    return v80;
  }
  s1 f82(const s1 &v0) {
    const std::vector<s1> v2 { v0, v0, v0, v0, v0 };
    const s0 v8 = v0.p1;
    const s1 v6 = f83(v0, v8);
    s0 v5 = v8;
    const std::vector<std::vector<double>> v7 = v8.p1;
    std::vector<s1> v4 = v2;
    v4[3] = v6;
    v4[2] = v0;
    const std::vector<std::vector<double>> v3 = v8.p0;
    const s1 v10 = f83(v0, v5);
    s1 v1 = v6;
    v5.p1 = v7;
    const s1 v13 = v4[3];
    const std::vector<double> v12 = v7[0];
    v4[3] = v10;
    std::vector<std::vector<double>> v15 = v3;
    v15[0] = v12;
    v15[0] = v12;
    const s0 v27 = f85(v5, v12);
    const std::vector<double> v37 = v15[0];
    const s0 v35 = f85(v8, v12);
    v5.p0 = v15;
    const s0 v29 = f85(v5, v37);
    v1.p1 = v27;
    const std::vector<double> v23 = v7[0];
    v1.p1 = v8;
    const std::vector<std::vector<double>> v47 = v35.p0;
    v4[4] = v1;
    v5.p0 = v47;
    v1.p1 = v5;
    const s0 v57 = v13.p1;
    const s1 v48(v29, v57);
    v5.p1 = v15;
    v1.p1 = v57;
    v15[1] = v23;
    v5.p0 = v15;
    v1.p1 = v5;
    return v48;
  }
  s0 f79(const s0 &v0, const s0 &v1) {
    s0 v7 = v1;
    const s1 v3(v1, v0);
    const s1 v5 = f82(v3);
    s1 v11 = v5;
    s1 v6 = v11;
    const s1 v9 = f83(v11, v1);
    const s1 v4 = f82(v6);
    const s0 v13 = v4.p0;
    const s0 v14 = v9.p1;
    const s0 v19 = v3.p0;
    v6.p0 = v7;
    const std::vector<std::vector<double>> v30 = v14.p0;
    const std::vector<double> v26 = v30[0];
    std::vector<double> v20 = v26;
    s1 v25 = v5;
    const s0 v24 = f85(v1, v20);
    const s1 v33 = f83(v9, v24);
    const std::vector<s1> v34 { v9, v4, v5, v25, v33 };
    const std::vector<std::vector<double>> v63 = v13.p0;
    v7.p1 = v63;
    const s1 v27 = v34[4];
    const s0 v46 = v4.p0;
    const s0 v49 = v33.p0;
    v6.p1 = v19;
    const s0 v125 = v5.p1;
    const std::vector<std::vector<double>> v55 = v46.p0;
    const s0 v65 = v27.p0;
    v6.p1 = v125;
    v7.p0 = v55;
    v25.p0 = v49;
    return v65;
  }
  s0 f72(const s0 &v0) {
    s0 v4 = v0;
    s0 v5 = v4;
    const std::vector<std::vector<double>> v6 = v5.p1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    v4.p1 = v7;
    const std::vector<s0> v13 { v5, v0, v5, v5, v5, v5 };
    v4.p1 = v6;
    const s0 v17 = v13[3];
    const std::vector<std::vector<double>> v35 = v17.p0;
    const s0 v45 = f79(v5, v17);
    v5.p1 = v35;
    return v45;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const s0 &v1, const double &v2) {
    const s0 v4 = f72(v1);
    const std::vector<std::vector<double>> v6 = v4.p0;
    const std::vector<double> v3 = v6[1];
    const std::vector<double> v15 = v6[0];
    const double v24 = v3[0];
    const double v87 = v15[0];
    const double v65 = v87 + v24;
    return v65;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } } });
    s0 v1({ { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } });
    double v2(20.0);
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
