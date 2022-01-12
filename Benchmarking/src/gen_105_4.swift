  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s1, _ v2: [s0], _ v3: Double) -> Double {
    let v7: s0 = v2[0]
    var v6: Double = v3
    let v13: [[Double]] = v7.p0
    var v12: Double = v3
    let v18: [Double] = v13[0]
    var v35: [Double] = v18
    var v45: [[Double]] = v13
    var v70: Double = v3
    var v33: Double = v70
    let v50: [Double] = v45[1]
    v45[0] = v35
    v45 = v13
    v12 = v33
    let v106: Double = v50[0]
    v35[0] = v12
    v35[0] = v6
    v35[0] = v12
    return v106
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]])))]
    let v1: s1 = s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))
    let v2: [s0] = [s0(p0: [[18.0], [19.0]], p1: [[20.0]])]
    let v3: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
