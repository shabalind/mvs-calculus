  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s0
    var p2: [[s0]]
    var p3: [s0]
    var p4: [s1]
    var p5: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v2: Double = v1
    let v7: s0 = v0.p1
    let v5: [[Double]] = v7.p1
    let v12: [Double] = v5[0]
    let v14: Double = v12[0]
    let v8: Double = v12[0]
    let v38: Double = v14 * v8
    var v36: Double = v2
    v2 = v38
    let v60: Double = v36 - v38
    return v60
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]), p2: [[s0(p0: [[4.0]], p1: [[5.0]])], [s0(p0: [[6.0]], p1: [[7.0]])]], p3: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]])], p4: [s1(p0: [s0(p0: [[14.0]], p1: [[15.0]])], p1: [s0(p0: [[16.0]], p1: [[17.0]])]), s1(p0: [s0(p0: [[18.0]], p1: [[19.0]])], p1: [s0(p0: [[20.0]], p1: [[21.0]])]), s1(p0: [s0(p0: [[22.0]], p1: [[23.0]])], p1: [s0(p0: [[24.0]], p1: [[25.0]])])], p5: [[s0(p0: [[26.0]], p1: [[27.0]])], [s0(p0: [[28.0]], p1: [[29.0]])], [s0(p0: [[30.0]], p1: [[31.0]])]])
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
