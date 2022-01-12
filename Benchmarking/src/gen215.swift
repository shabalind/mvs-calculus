  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: s0
    var p2: s0
    var p3: [[s1]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s3, _ v2: Double) -> Double {
    let v7: Double = v2 + v2
    let v6: Double = v2 - v7
    var v21: Double = v6
    v21 = v6
    let v73: [Double] = [v21]
    let v60: Double = v2 + v6
    let v46: Double = v73[0]
    let v81: Double = v2 * v60
    let v134: Double = v46 + v60
    let v148: Double = v81 * v134
    return v148
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: s3 = s3(p0: s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p2: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p3: [[s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]]))], [s1(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]]))], [s1(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0]]), p1: s0(p0: [[30.0], [31.0]], p1: [[32.0]]))]])
    let v2: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
