  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: Double
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s1]]
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s0], _ v2: s2, _ v3: [s3], _ v4: Double) -> Double {
    let v5: Double = v4 * v4
    var v15: Double = v5
    let v6: [[s1]] = v0.p1
    let v16: Double = v5 * v15
    let v27: [s1] = v6[0]
    let v24: Double = v5 + v16
    let v14: s1 = v27[0]
    var v34: Double = v16
    let v42: Double = v5 - v24
    var v127: Double = v34
    let v102: Double = v14.p0
    let v74: Double = v102 - v42
    let v159: Double = v127 + v74
    return v159
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: 0.0, p1: s0(p0: [[1.0]], p1: [[2.0]])), p1: [[s1(p0: 3.0, p1: s0(p0: [[4.0]], p1: [[5.0]]))], [s1(p0: 6.0, p1: s0(p0: [[7.0]], p1: [[8.0]]))]])
    let v1: [s0] = [s0(p0: [[9.0]], p1: [[10.0]]), s0(p0: [[11.0]], p1: [[12.0]])]
    let v2: s2 = s2(p0: s1(p0: 13.0, p1: s0(p0: [[14.0]], p1: [[15.0]])), p1: [[s1(p0: 16.0, p1: s0(p0: [[17.0]], p1: [[18.0]]))], [s1(p0: 19.0, p1: s0(p0: [[20.0]], p1: [[21.0]]))]])
    let v3: [s3] = [s3(p0: [s1(p0: 22.0, p1: s0(p0: [[23.0]], p1: [[24.0]]))], p1: s0(p0: [[25.0]], p1: [[26.0]])), s3(p0: [s1(p0: 27.0, p1: s0(p0: [[28.0]], p1: [[29.0]]))], p1: s0(p0: [[30.0]], p1: [[31.0]])), s3(p0: [s1(p0: 32.0, p1: s0(p0: [[33.0]], p1: [[34.0]]))], p1: s0(p0: [[35.0]], p1: [[36.0]]))]
    let v4: Double = 37.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 37.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
