  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  func f49(_ v0: Double) -> Double {
    let v3: Double = v0 + v0
    var v5: Double = v3
    var v4: Double = v3
    v4 = v5
    var v7: Double = v0
    v4 = v5
    let v10: [Double] = [v4, v7, v7]
    var v20: [Double] = v10
    let v32: Double = v20[2]
    return v32
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    var v2: Double = v1
    let v20: Double = f49(v2)
    let v17: Double = v20 / v1
    return v17
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0]])], p1: s2(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0], [9.0], [10.0]], p2: [[11.0]]), p1: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0], [16.0]], p2: [[17.0]]), p1: [[s0(p0: [[18.0], [19.0]], p1: [[20.0], [21.0], [22.0]], p2: [[23.0]])], [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0], [28.0]], p2: [[29.0]])]])))]
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
