  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v5: [s1] = v0[0]
    let v6: s1 = v5[0]
    let v10: s0 = v6.p1
    let v11: s1 = v5[0]
    let v9: s0 = v11.p0
    let v20: [[Double]] = v10.p3
    let v15: [Double] = v20[1]
    let v31: [[Double]] = v9.p5
    var v36: [[Double]] = v31
    v36[0] = v15
    let v41: [Double] = v36[0]
    v36[0] = v15
    let v134: Double = v41[0]
    return v134
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: [[3.0], [4.0], [5.0]], p3: [[6.0], [7.0], [8.0]], p4: [[9.0], [10.0]], p5: [[11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0]], p2: [[15.0], [16.0], [17.0]], p3: [[18.0], [19.0], [20.0]], p4: [[21.0], [22.0]], p5: [[23.0]]))]]
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
