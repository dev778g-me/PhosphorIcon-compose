package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CoinFill: ImageVector
    get() {
        if (_CoinFill != null) {
            return _CoinFill!!
        }
        _CoinFill = ImageVector.Builder(
            name = "Filled.CoinFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(207.58f, 63.84f)
                curveTo(186.85f, 53.48f, 159.33f, 48f, 128f, 48f)
                reflectiveCurveTo(69.15f, 53.48f, 48.42f, 63.84f)
                reflectiveCurveTo(16f, 88.78f, 16f, 104f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 15.22f, 11.82f, 29.85f, 32.42f, 40.16f)
                reflectiveCurveTo(96.67f, 208f, 128f, 208f)
                reflectiveCurveToRelative(58.85f, -5.48f, 79.58f, -15.84f)
                reflectiveCurveTo(240f, 167.22f, 240f, 152f)
                lineTo(240f, 104f)
                curveTo(240f, 88.78f, 228.18f, 74.15f, 207.58f, 63.84f)
                close()
                moveTo(120f, 159.84f)
                verticalLineToRelative(32f)
                curveToRelative(-19f, -0.62f, -35f, -3.42f, -48f, -7.49f)
                lineTo(72f, 153.05f)
                arcTo(203.43f, 203.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 159.86f)
                close()
                moveTo(136f, 159.84f)
                arcToRelative(203.43f, 203.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -6.81f)
                verticalLineToRelative(31.31f)
                curveToRelative(-13f, 4.07f, -29f, 6.87f, -48f, 7.49f)
                close()
                moveTo(32f, 152f)
                lineTo(32f, 133.53f)
                arcToRelative(82.88f, 82.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.42f, 10.63f)
                curveToRelative(2.43f, 1.21f, 5f, 2.35f, 7.58f, 3.43f)
                lineTo(56f, 178f)
                curveTo(40.17f, 170.16f, 32f, 160.29f, 32f, 152f)
                close()
                moveTo(200f, 178f)
                lineTo(200f, 147.59f)
                curveToRelative(2.61f, -1.08f, 5.15f, -2.22f, 7.58f, -3.43f)
                arcTo(82.88f, 82.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 133.53f)
                lineTo(224f, 152f)
                curveTo(224f, 160.29f, 215.83f, 170.16f, 200f, 178f)
                close()
            }
        }.build()

        return _CoinFill!!
    }

@Suppress("ObjectPropertyName")
private var _CoinFill: ImageVector? = null
