  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s1]
  }
  struct s4 {
    var p0: s3
    var p1: s2
  }
  struct s6 {
    var p0: s1
  }
  struct s8 {
    var p0: [s1]
    var p1: [s1]
    var p2: s2
    var p3: [[s2]]
    var p4: s2
    var p5: s6
    var p6: Double
  }
  func f88(_ v0: s2) -> s2 {
    var v3: s2 = v0
    var v5: s2 = v3
    let v2: [s2] = [v3, v3]
    let v6: [s2] = [v5, v0, v5, v3, v5, v0, v0]
    v5 = v0
    var v1: [s2] = v6
    var v8: [s2] = v6
    let v7: [s0] = v3.p0
    let v14: s0 = v5.p1
    v8[5] = v5
    var v11: s2 = v5
    let v10: Double = v14.p0
    let v9: s2 = v2[1]
    let v12: s0 = v7[1]
    let v13: [[Double]] = v14.p1
    let v19: s0 = s0(p0: v10, p1: v13)
    v8[2] = v0
    v1[0] = v11
    v8[4] = v3
    let v25: s2 = v6[0]
    let v17: [s0] = v9.p0
    v1[4] = v0
    v5.p0 = v17
    let v24: s2 = s2(p0: v7, p1: v14)
    v11.p0 = v7
    v8[5] = v25
    var v22: s2 = v24
    v3.p0 = v17
    var v21: [s2] = v1
    let v50: [s0] = v24.p0
    let v54: s2 = v8[1]
    var v37: s2 = v54
    let v67: s0 = v50[1]
    let v49: [s0] = v3.p0
    var v53: [s2] = v8
    v3.p1 = v12
    v3.p1 = v19
    var v31: s2 = v22
    v31.p0 = v49
    v37.p0 = v50
    v21 = v53
    v3.p0 = v50
    let v70: s2 = v21[0]
    v11.p0 = v50
    v8[2] = v31
    v53[4] = v37
    v8[2] = v70
    v11.p1 = v67
    let v142: [s0] = v5.p0
    v3.p0 = v142
    return v37
  }
  func f36(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    var v2: s0 = v0
    let v11: Double = v2.p0
    let v7: s0 = s0(p0: v11, p1: v6)
    let v8: [[Double]] = v7.p1
    var v3: s0 = v2
    v2.p1 = v8
    let v22: [s0] = [v3, v2, v2, v2]
    let v16: s0 = v22[3]
    return v16
  }
  func f15(_ v0: s0, _ v1: s4) -> s0 {
    let v4: s0 = f36(v0)
    let v2: s0 = f36(v4)
    var v8: s0 = v2
    v8 = v2
    return v8
  }
  func f1(_ v0: s2) -> s2 {
    var v5: s2 = v0
    let v11: s2 = f88(v5)
    let v38: s2 = f88(v11)
    return v38
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: [s8], _ v2: Double) -> Double {
    let v7: s4 = v0[0]
    let v18: s4 = v0[0]
    let v11: s2 = v7.p1
    let v13: s2 = f88(v11)
    let v14: s2 = f1(v13)
    let v23: s2 = f88(v14)
    let v41: [s0] = v23.p0
    let v45: s0 = v41[1]
    let v24: s0 = f15(v45, v18)
    let v46: [[Double]] = v24.p1
    let v58: [Double] = v46[0]
    let v88: Double = v58[0]
    return v88
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s3(p0: s1(p0: s0(p0: 0.0, p1: [[1.0]]), p1: s0(p0: 2.0, p1: [[3.0]])), p1: [s1(p0: s0(p0: 4.0, p1: [[5.0]]), p1: s0(p0: 6.0, p1: [[7.0]]))]), p1: s2(p0: [s0(p0: 8.0, p1: [[9.0]]), s0(p0: 10.0, p1: [[11.0]])], p1: s0(p0: 12.0, p1: [[13.0]]))), s4(p0: s3(p0: s1(p0: s0(p0: 14.0, p1: [[15.0]]), p1: s0(p0: 16.0, p1: [[17.0]])), p1: [s1(p0: s0(p0: 18.0, p1: [[19.0]]), p1: s0(p0: 20.0, p1: [[21.0]]))]), p1: s2(p0: [s0(p0: 22.0, p1: [[23.0]]), s0(p0: 24.0, p1: [[25.0]])], p1: s0(p0: 26.0, p1: [[27.0]])))]
    let v1: [s8] = [s8(p0: [s1(p0: s0(p0: 28.0, p1: [[29.0]]), p1: s0(p0: 30.0, p1: [[31.0]])), s1(p0: s0(p0: 32.0, p1: [[33.0]]), p1: s0(p0: 34.0, p1: [[35.0]]))], p1: [s1(p0: s0(p0: 36.0, p1: [[37.0]]), p1: s0(p0: 38.0, p1: [[39.0]])), s1(p0: s0(p0: 40.0, p1: [[41.0]]), p1: s0(p0: 42.0, p1: [[43.0]]))], p2: s2(p0: [s0(p0: 44.0, p1: [[45.0]]), s0(p0: 46.0, p1: [[47.0]])], p1: s0(p0: 48.0, p1: [[49.0]])), p3: [[s2(p0: [s0(p0: 50.0, p1: [[51.0]]), s0(p0: 52.0, p1: [[53.0]])], p1: s0(p0: 54.0, p1: [[55.0]]))], [s2(p0: [s0(p0: 56.0, p1: [[57.0]]), s0(p0: 58.0, p1: [[59.0]])], p1: s0(p0: 60.0, p1: [[61.0]]))], [s2(p0: [s0(p0: 62.0, p1: [[63.0]]), s0(p0: 64.0, p1: [[65.0]])], p1: s0(p0: 66.0, p1: [[67.0]]))]], p4: s2(p0: [s0(p0: 68.0, p1: [[69.0]]), s0(p0: 70.0, p1: [[71.0]])], p1: s0(p0: 72.0, p1: [[73.0]])), p5: s6(p0: s1(p0: s0(p0: 74.0, p1: [[75.0]]), p1: s0(p0: 76.0, p1: [[77.0]]))), p6: 78.0), s8(p0: [s1(p0: s0(p0: 79.0, p1: [[80.0]]), p1: s0(p0: 81.0, p1: [[82.0]])), s1(p0: s0(p0: 83.0, p1: [[84.0]]), p1: s0(p0: 85.0, p1: [[86.0]]))], p1: [s1(p0: s0(p0: 87.0, p1: [[88.0]]), p1: s0(p0: 89.0, p1: [[90.0]])), s1(p0: s0(p0: 91.0, p1: [[92.0]]), p1: s0(p0: 93.0, p1: [[94.0]]))], p2: s2(p0: [s0(p0: 95.0, p1: [[96.0]]), s0(p0: 97.0, p1: [[98.0]])], p1: s0(p0: 99.0, p1: [[100.0]])), p3: [[s2(p0: [s0(p0: 101.0, p1: [[102.0]]), s0(p0: 103.0, p1: [[104.0]])], p1: s0(p0: 105.0, p1: [[106.0]]))], [s2(p0: [s0(p0: 107.0, p1: [[108.0]]), s0(p0: 109.0, p1: [[110.0]])], p1: s0(p0: 111.0, p1: [[112.0]]))], [s2(p0: [s0(p0: 113.0, p1: [[114.0]]), s0(p0: 115.0, p1: [[116.0]])], p1: s0(p0: 117.0, p1: [[118.0]]))]], p4: s2(p0: [s0(p0: 119.0, p1: [[120.0]]), s0(p0: 121.0, p1: [[122.0]])], p1: s0(p0: 123.0, p1: [[124.0]])), p5: s6(p0: s1(p0: s0(p0: 125.0, p1: [[126.0]]), p1: s0(p0: 127.0, p1: [[128.0]]))), p6: 129.0)]
    let v2: Double = 130.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 130.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
