  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s0> p1;
    s3(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s2> p0;
    std::vector<s1> p1;
    s4(std::vector<s2> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<std::vector<s1>> p0;
    std::vector<std::vector<s3>> p1;
    s5(std::vector<std::vector<s1>> v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s4 p0;
    s5 p1;
    s6(s4 v0, s5 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s6 p0;
    s3 p1;
    s7(s6 v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s7 p0;
    s7 p1;
    s9(s7 v0, s7 v1): p0(v0), p1(v1) { }
  };
  s0 f28(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<s0> v1 { v0, v0, v0 };
    const s0 v3 = v1[1];
    const std::vector<std::vector<double>> v8 = v3.p1;
    std::vector<std::vector<double>> v14 = v8;
    const std::vector<double> v17 = v14[2];
    const s0 v21 = v1[0];
    const s0 v31 = v1[2];
    const std::vector<double> v25 = v8[1];
    std::vector<std::vector<double>> v26 = v7;
    const s0 v45(v26, v14);
    v26[0] = v17;
    const std::vector<std::vector<double>> v117 = v31.p0;
    const std::vector<std::vector<double>> v67 = v21.p1;
    s0 v60 = v21;
    const std::vector<std::vector<double>> v66 = v45.p1;
    v14[0] = v25;
    v60.p1 = v66;
    const std::vector<std::vector<double>> v76 = v3.p1;
    const std::vector<std::vector<double>> v125 = v60.p1;
    v60.p1 = v125;
    v60.p1 = v76;
    v60.p0 = v117;
    v60.p1 = v67;
    return v60;
  }
  s0 f15(const s0 &v0) {
    const s0 v3 = f28(v0);
    const s0 v1 = f28(v3);
    const std::vector<std::vector<double>> v8 = v1.p0;
    const std::vector<std::vector<std::vector<double>>> v4 { v8, v8, v8, v8, v8, v8 };
    const std::vector<std::vector<double>> v6 = v1.p1;
    const std::vector<std::vector<double>> v16 = v4[2];
    const s0 v28(v16, v6);
    return v28;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s9 &v1, const double &v2) {
    const double v6 = v2 - v2;
    std::vector<s0> v13 = v0;
    const s0 v20 = v0[1];
    const s0 v38 = v13[1];
    v13[2] = v38;
    const std::vector<std::vector<double>> v29 = v38.p1;
    s0 v26 = v20;
    const std::vector<double> v28 = v29[0];
    v26.p1 = v29;
    const s0 v68 = f15(v20);
    v26.p1 = v29;
    v26.p1 = v29;
    const double v27 = v6 + v6;
    v13[2] = v26;
    const double v43 = v28[0];
    double v67 = v43;
    const double v89 = v67 + v6;
    const s0 v63 = f15(v38);
    const std::vector<std::vector<double>> v96 = v63.p0;
    v26.p0 = v96;
    v26.p0 = v96;
    v13[0] = v68;
    const double v146 = v89 * v27;
    return v146;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    s9 v1({ { { { { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } } }, { { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } } } }, { { { { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } } } }, { { { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } }, { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } }, { { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } }, { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } } } } } } }, { { { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } } }, { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } }, { { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } }, { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } }, { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } }, { { { { { { { { 120.0 } }, { { 121.0 }, { 122.0 }, { 123.0 } } }, { { { { { 124.0 } }, { { 125.0 }, { 126.0 }, { 127.0 } } }, { { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } }, { { { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } } } } } }, { { { { { { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } }, { { { 144.0 } }, { { 145.0 }, { 146.0 }, { 147.0 } } } }, { { { { { 148.0 } }, { { 149.0 }, { 150.0 }, { 151.0 } } }, { { { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } } }, { { { 156.0 } }, { { 157.0 }, { 158.0 }, { 159.0 } } } } } }, { { { { { { { { 160.0 } }, { { 161.0 }, { 162.0 }, { 163.0 } } }, { { { 164.0 } }, { { 165.0 }, { 166.0 }, { 167.0 } } } }, { { { 168.0 } }, { { 169.0 }, { 170.0 }, { 171.0 } } } } } }, { { { { { { { 172.0 } }, { { 173.0 }, { 174.0 }, { 175.0 } } }, { { { { { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } }, { { { 180.0 } }, { { 181.0 }, { 182.0 }, { 183.0 } } } }, { { { 184.0 } }, { { 185.0 }, { 186.0 }, { 187.0 } } } } }, { { { { 188.0 } }, { { 189.0 }, { 190.0 }, { 191.0 } } }, { { { 192.0 } }, { { 193.0 }, { 194.0 }, { 195.0 } } }, { { { 196.0 } }, { { 197.0 }, { 198.0 }, { 199.0 } } } } } } } } }, { { { { { 200.0 } }, { { 201.0 }, { 202.0 }, { 203.0 } } }, { { { { { 204.0 } }, { { 205.0 }, { 206.0 }, { 207.0 } } }, { { { 208.0 } }, { { 209.0 }, { 210.0 }, { 211.0 } } } }, { { { 212.0 } }, { { 213.0 }, { 214.0 }, { 215.0 } } } } }, { { { { 216.0 } }, { { 217.0 }, { 218.0 }, { 219.0 } } }, { { { 220.0 } }, { { 221.0 }, { 222.0 }, { 223.0 } } }, { { { 224.0 } }, { { 225.0 }, { 226.0 }, { 227.0 } } } } } } });
    double v2(228.0);
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
