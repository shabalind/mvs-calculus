  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: s1
    var p2: [s1]
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    var v5: [[s3]] = v0
    let v3: [s3] = v5[0]
    let v4: s3 = v3[0]
    let v6: s2 = v4.p0
    let v8: [s0] = v6.p1
    let v2: s0 = v8[1]
    var v12: [[s3]] = v0
    v5 = v12
    v12[0] = v3
    var v19: s0 = v2
    v5[0] = v3
    let v29: s0 = v8[2]
    let v26: [[Double]] = v19.p0
    let v57: [s3] = v12[0]
    v5[0] = v57
    v19.p0 = v26
    let v74: [Double] = v26[0]
    let v39: Double = v74[0]
    let v50: [[Double]] = v29.p1
    v19.p1 = v50
    v5 = v0
    return v39
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]], p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), p1: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]])]), p2: [s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: [s0(p0: [[21.0], [22.0]], p1: [[23.0]])]), s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: [s0(p0: [[27.0], [28.0]], p1: [[29.0]])])])]]
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
