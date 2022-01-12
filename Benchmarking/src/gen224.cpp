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
  s0 f41(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<double> v7 = v5[0];
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<double> v12 = v5[0];
    const std::vector<std::vector<double>> v16 = v0.p0;
    const std::vector<double> v10 = v1[0];
    const std::vector<std::vector<double>> v13 = v0.p1;
    std::vector<std::vector<double>> v17 = v1;
    const std::vector<std::vector<double>> v21 = v0.p0;
    s0 v15 = v0;
    const std::vector<std::vector<double>> v32 = v15.p1;
    v15.p0 = v5;
    v15.p1 = v13;
    v17[0] = v12;
    v15.p1 = v32;
    const std::vector<std::vector<double>> v23 = v0.p0;
    v17[0] = v10;
    const std::vector<std::vector<double>> v45 = v0.p1;
    const std::vector<double> v30 = v45[0];
    std::vector<std::vector<double>> v28 = v13;
    v15.p0 = v21;
    v17[0] = v30;
    v15.p0 = v21;
    v15.p0 = v17;
    const s1 v38(v15, v15);
    const s0 v84 = v38.p0;
    s0 v68 = v0;
    const std::vector<double> v47 = v5[0];
    s0 v76 = v15;
    v28[0] = v47;
    v76.p0 = v17;
    v17[0] = v30;
    v17[0] = v7;
    const std::vector<double> v67 = v23[0];
    const std::vector<double> v35 = v13[0];
    v15.p0 = v16;
    const s1 v46(v68, v76);
    v15 = v76;
    const s0 v112 = v46.p1;
    v28[0] = v67;
    v76.p1 = v9;
    v68.p0 = v5;
    s1 v78 = v38;
    v76.p1 = v28;
    v76 = v112;
    v17[0] = v35;
    v78.p1 = v84;
    const s0 v136 = v78.p0;
    return v136;
  }
  s0 f35(const s0 &v0) {
    const std::vector<s0> v3 { v0, v0, v0 };
    const s0 v5 = v3[0];
    const s1 v8(v5, v5);
    const s0 v11 = v8.p0;
    const s0 v28 = f41(v11);
    return v28;
  }
  s1 f27(const s1 &v0, const s1 &v1) {
    s1 v3 = v1;
    return v3;
  }
  std::vector<s1> f12(const std::vector<s1> &v0) {
    const s1 v4 = v0[2];
    const s0 v7 = v4.p0;
    const s0 v3 = f41(v7);
    const s1 v2 = v0[1];
    s1 v6 = v2;
    s1 v11 = v4;
    std::vector<s1> v5 = v0;
    const s0 v9 = f41(v3);
    const s0 v18 = v6.p1;
    const s1 v1 = v5[2];
    v11.p0 = v9;
    v5[1] = v2;
    const s0 v22 = v4.p1;
    v5[0] = v6;
    const s1 v14 = f27(v4, v6);
    s0 v29 = v3;
    v5[1] = v1;
    const s1 v23(v7, v22);
    const s1 v25 = f27(v2, v23);
    v5[0] = v25;
    s1 v30 = v2;
    v5[0] = v14;
    v11.p0 = v9;
    v5[2] = v1;
    v30.p0 = v29;
    const s0 v77 = v11.p0;
    v5[2] = v30;
    std::vector<s1> v41 = v0;
    const s1 v73 = v5[2];
    v6.p0 = v18;
    v41[1] = v6;
    v6.p0 = v77;
    const std::vector<std::vector<s1>> v64 { v5, v41, v0, v5, v0, v0 };
    const s1 v72 = v0[0];
    v6.p1 = v22;
    v5[2] = v73;
    v41[0] = v72;
    v41[2] = v25;
    const std::vector<s1> v85 = v64[1];
    return v85;
  }
  s0 f10(const s0 &v0) {
    s0 v7 = v0;
    s0 v8 = v7;
    const s0 v4 = f35(v8);
    const s0 v3 = f35(v8);
    s0 v5 = v7;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v13 { v2, v2, v2, v2 };
    const std::vector<std::vector<double>> v1 = v7.p1;
    v8.p1 = v1;
    std::vector<std::vector<std::vector<double>>> v9 = v13;
    const s0 v21 = f41(v5);
    v7.p1 = v2;
    const std::vector<std::vector<double>> v20 = v7.p1;
    const std::vector<std::vector<double>> v17 = v21.p0;
    v9[2] = v1;
    const std::vector<std::vector<double>> v23 = v7.p0;
    const std::vector<std::vector<double>> v25 = v7.p0;
    v9[0] = v2;
    const std::vector<std::vector<double>> v58 = v4.p1;
    std::vector<std::vector<std::vector<double>>> v28 = v9;
    v7 = v21;
    v28[3] = v2;
    v28[1] = v20;
    const std::vector<std::vector<double>> v19 = v28[1];
    const s0 v37 = f41(v3);
    const s0 v27 = f35(v21);
    v28[0] = v2;
    v8 = v3;
    const std::vector<std::vector<double>> v29 = v37.p0;
    s0 v42 = v27;
    v8.p1 = v19;
    v28[3] = v19;
    const s0 v84 = f35(v42);
    v8.p0 = v29;
    v9[3] = v58;
    const std::vector<std::vector<double>> v39 = v84.p0;
    const s0 v81 = f35(v37);
    v5 = v4;
    const std::vector<std::vector<double>> v69 = v3.p0;
    v8.p0 = v29;
    v28[0] = v19;
    const std::vector<std::vector<double>> v66 = v81.p1;
    const std::vector<std::vector<std::vector<double>>> v82 { v39, v25, v69, v23, v17 };
    const std::vector<std::vector<double>> v77 = v82[1];
    const s0 v93(v77, v66);
    return v93;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const std::vector<s1> v5 = f12(v0);
    const std::vector<s1> v6 = f12(v0);
    const s1 v3 = v0[0];
    const s1 v7 = v0[1];
    s1 v4 = v7;
    v4 = v7;
    const s1 v8 = v0[0];
    std::vector<s1> v12 = v5;
    v12[1] = v7;
    const s1 v19 = v0[1];
    const s0 v11 = v8.p0;
    const s0 v22 = v4.p1;
    const s0 v13 = f35(v22);
    const s1 v17 = v12[2];
    s0 v43 = v13;
    v4.p1 = v11;
    const s0 v31 = f10(v22);
    const std::vector<std::vector<double>> v55 = v43.p0;
    v4.p0 = v31;
    const s0 v54 = f41(v22);
    const std::vector<std::vector<double>> v28 = v43.p1;
    std::vector<std::vector<double>> v51 = v28;
    const std::vector<double> v91 = v55[0];
    const s0 v47 = v17.p0;
    std::vector<double> v96 = v91;
    const s1 v143 = v6[1];
    v43.p1 = v51;
    v4.p0 = v13;
    const s1 v66 = f27(v143, v19);
    const std::vector<std::vector<double>> v140 = v54.p0;
    const std::vector<std::vector<double>> v132 = v47.p1;
    const std::vector<double> v120 = v140[0];
    const std::vector<double> v112 = v140[0];
    v51[1] = v112;
    const s0 v173 = v66.p0;
    v51[0] = v120;
    const double v105 = v96[0];
    v4.p1 = v173;
    v12[2] = v3;
    v4.p0 = v54;
    v43.p1 = v132;
    const std::vector<std::vector<double>> v165 = v173.p0;
    v43.p0 = v165;
    v4.p1 = v173;
    return v105;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } });
    double v1(18.0);
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
