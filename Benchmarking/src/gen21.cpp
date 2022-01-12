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
  std::vector<s0> f76(const std::vector<s0> &v0) {
    std::vector<s0> v2 = v0;
    std::vector<s0> v1 = v2;
    v2 = v1;
    const s0 v7 = v2[0];
    s0 v3 = v7;
    v2[0] = v3;
    const s0 v5 = v2[0];
    const s0 v6 = v0[0];
    const s0 v10 = v1[0];
    const s0 v4 = v2[0];
    const std::vector<std::vector<double>> v8 = v4.p1;
    v2[0] = v10;
    s0 v16 = v5;
    std::vector<std::vector<double>> v11 = v8;
    const std::vector<std::vector<double>> v13 = v5.p0;
    const std::vector<std::vector<double>> v33 = v16.p0;
    const std::vector<std::vector<double>> v30 = v3.p1;
    v3.p1 = v30;
    s0 v65 = v5;
    v3.p1 = v11;
    const std::vector<std::vector<double>> v19 = v4.p0;
    v16.p0 = v13;
    const std::vector<std::vector<double>> v36 = v10.p0;
    v3.p0 = v36;
    v2[0] = v7;
    const std::vector<std::vector<double>> v87 = v4.p0;
    const std::vector<std::vector<double>> v34 = v65.p1;
    const std::vector<std::vector<double>> v48 = v65.p0;
    v1[0] = v6;
    v1[0] = v16;
    v65.p0 = v36;
    v3.p0 = v36;
    v3.p0 = v19;
    v65.p1 = v34;
    v1[0] = v65;
    const std::vector<std::vector<double>> v66 = v16.p0;
    v65.p0 = v33;
    v65.p0 = v87;
    v1[0] = v7;
    std::vector<std::vector<double>> v128 = v66;
    const std::vector<double> v165 = v8[0];
    v16.p0 = v48;
    v65.p0 = v128;
    v128[1] = v165;
    v65.p0 = v66;
    v65.p1 = v11;
    return v1;
  }
  s1 f51(const s1 &v0) {
    s1 v5 = v0;
    const s0 v9 = v5.p0;
    const s1 v3(v9, v9);
    s0 v8 = v9;
    s1 v6 = v3;
    v5.p1 = v8;
    s1 v2 = v6;
    s0 v1 = v8;
    v2.p1 = v1;
    v2.p0 = v8;
    return v2;
  }
  s0 f46(const s0 &v0, const s0 &v1) {
    const std::vector<s0> v4 { v1, v1 };
    const std::vector<std::vector<double>> v7 = v0.p1;
    std::vector<std::vector<double>> v5 = v7;
    std::vector<s0> v9 = v4;
    const s1 v2(v1, v0);
    s1 v17 = v2;
    const s0 v13 = v2.p1;
    const s1 v19 = f51(v17);
    const s0 v8 = v2.p0;
    const s0 v18 = v9[1];
    const std::vector<std::vector<double>> v11 = v8.p0;
    s0 v10 = v13;
    const s1 v12 = f51(v2);
    v17.p0 = v8;
    const std::vector<std::vector<double>> v48 = v1.p1;
    v17.p1 = v10;
    const s0 v21 = v12.p0;
    const s0 v25 = v19.p0;
    v10.p1 = v5;
    v10.p1 = v7;
    v10.p1 = v5;
    v10.p0 = v11;
    v17.p0 = v18;
    v17.p1 = v1;
    const std::vector<s0> v63 { v25 };
    s0 v59 = v21;
    const std::vector<s0> v60 = f76(v63);
    v9[0] = v59;
    const std::vector<s0> v53 = f76(v60);
    v59.p1 = v48;
    std::vector<s0> v30 = v53;
    const s0 v51 = v30[0];
    return v51;
  }
  s0 f34(const s0 &v0) {
    s0 v1 = v0;
    const s0 v3 = f46(v1, v0);
    s0 v6 = v0;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v4 = v1.p0;
    v1.p0 = v4;
    const std::vector<std::vector<double>> v5 = v6.p1;
    const std::vector<double> v11 = v4[0];
    s0 v2 = v6;
    std::vector<std::vector<double>> v18 = v5;
    v18[0] = v11;
    const std::vector<std::vector<double>> v33 = v1.p0;
    v2 = v1;
    v18[0] = v11;
    const s1 v24(v0, v2);
    const s0 v35 = v24.p1;
    v2.p1 = v18;
    const s0 v23 = f46(v35, v3);
    const s0 v30 = f46(v6, v23);
    const std::vector<double> v17 = v7[1];
    const std::vector<std::vector<double>> v27 = v3.p0;
    const std::vector<double> v29 = v27[1];
    v18[0] = v29;
    const std::vector<std::vector<double>> v31 = v35.p1;
    v6.p0 = v33;
    v18[0] = v17;
    const s0 v77 = f46(v1, v30);
    v2.p1 = v31;
    return v77;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v4 = v0[0];
    const s0 v2 = f34(v4);
    const std::vector<std::vector<double>> v18 = v2.p1;
    const std::vector<double> v9 = v18[0];
    const double v43 = v9[0];
    const double v72 = v43 + v43;
    return v72;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } });
    double v1(6.0);
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
