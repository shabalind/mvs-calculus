  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v11: [s0] = v0.p1
    let v7: s0 = v11[0]
    let v5: [[Double]] = v7.p0
    let v10: [[Double]] = v7.p1
    let v12: [Double] = v5[1]
    let v15: [Double] = v5[1]
    let v16: Double = v15[0]
    var v27: [[Double]] = v10
    v27[1] = v15
    let v45: Double = v1 / v1
    let v41: [Double] = v27[0]
    let v74: Double = v41[0]
    v27[0] = v12
    let v161: Double = v16 - v74
    let v67: Double = v45 * v161
    return v67
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0]])]], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0], [9.0], [10.0]], p2: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0], [16.0]], p2: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0], [21.0], [22.0]], p2: [[23.0]])])
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
