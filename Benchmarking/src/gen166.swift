  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
    var p2: s0
    var p3: s0
    var p4: [[Double]]
    var p5: [s0]
  }
  func f52(_ v0: s0) -> s0 {
    let v5: Double = v0.p0
    let v7: Double = v0.p0
    var v1: s0 = v0
    v1.p0 = v5
    v1.p0 = v5
    var v4: s0 = v1
    let v8: [[Double]] = v1.p1
    let v3: [Double] = v8[0]
    var v9: Double = v7
    v1 = v0
    let v6: [[Double]] = v4.p1
    var v16: [Double] = v3
    var v21: [[Double]] = v8
    var v11: Double = v9
    let v19: [Double] = v6[0]
    let v56: s0 = s0(p0: v11, p1: v8)
    let v28: Double = v19[0]
    v21[0] = v16
    v1.p1 = v21
    v16[0] = v28
    v1.p0 = v28
    return v56
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v5: s1 = v0[1]
    var v7: s1 = v5
    let v6: [s0] = v5.p1
    v7.p5 = v6
    let v2: [s0] = v5.p1
    v7.p1 = v2
    v7.p5 = v2
    v7.p1 = v2
    let v4: s0 = v6[1]
    var v10: s1 = v7
    var v46: s1 = v10
    let v27: s0 = v2[0]
    let v26: s0 = v10.p3
    let v22: s0 = f52(v26)
    v10.p2 = v27
    v46.p3 = v26
    let v25: s1 = v0[1]
    let v123: [s0] = v46.p1
    let v38: s0 = v25.p2
    v10.p2 = v22
    v10.p3 = v4
    v10.p5 = v123
    v10.p1 = v123
    var v62: s0 = v26
    v7.p2 = v38
    let v208: Double = v62.p0
    return v208
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: 0.0, p1: [[1.0]])]], p1: [s0(p0: 2.0, p1: [[3.0]]), s0(p0: 4.0, p1: [[5.0]]), s0(p0: 6.0, p1: [[7.0]])], p2: s0(p0: 8.0, p1: [[9.0]]), p3: s0(p0: 10.0, p1: [[11.0]]), p4: [[12.0], [13.0]], p5: [s0(p0: 14.0, p1: [[15.0]]), s0(p0: 16.0, p1: [[17.0]]), s0(p0: 18.0, p1: [[19.0]])]), s1(p0: [[s0(p0: 20.0, p1: [[21.0]])]], p1: [s0(p0: 22.0, p1: [[23.0]]), s0(p0: 24.0, p1: [[25.0]]), s0(p0: 26.0, p1: [[27.0]])], p2: s0(p0: 28.0, p1: [[29.0]]), p3: s0(p0: 30.0, p1: [[31.0]]), p4: [[32.0], [33.0]], p5: [s0(p0: 34.0, p1: [[35.0]]), s0(p0: 36.0, p1: [[37.0]]), s0(p0: 38.0, p1: [[39.0]])])]
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
