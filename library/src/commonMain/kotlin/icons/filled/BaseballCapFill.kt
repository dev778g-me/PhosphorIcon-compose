package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BaseballCapFill: ImageVector
    get() {
        if (_BaseballCapFill != null) {
            return _BaseballCapFill!!
        }
        _BaseballCapFill = ImageVector.Builder(
            name = "Filled.BaseballCapFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 128f)
                verticalLineToRelative(56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                arcToRelative(24.11f, 24.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.18f, -4.64f)
                curveTo(74.33f, 194.53f, 95.6f, 184f, 128f, 184f)
                reflectiveCurveToRelative(53.67f, 10.52f, 65.81f, 19.35f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 184f)
                lineTo(232f, 128f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(40f, 128f)
                arcTo(88.15f, 88.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109.81f, 41.9f)
                arcToRelative(167f, 167f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28.87f, 76.76f)
                arcTo(166f, 166f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 136.88f)
                close()
                moveTo(216f, 184f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.34f, 7.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.44f, -0.69f)
                curveTo(189.16f, 180.2f, 164.7f, 168f, 128f, 168f)
                reflectiveCurveTo(66.84f, 180.2f, 52.78f, 190.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.44f, 0.69f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 184f)
                lineTo(40f, 156.07f)
                arcToRelative(150.62f, 150.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 49.93f, -23.28f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -0.26f)
                arcToRelative(154.06f, 154.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.17f, 0f)
                arcToRelative(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 0.27f)
                arcTo(150.49f, 150.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 156.07f)
                close()
                moveTo(216f, 136.87f)
                arcToRelative(166f, 166f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40.94f, -18.22f)
                arcTo(167f, 167f, 0f, isMoreThanHalf = false, isPositiveArc = false, 146.19f, 41.9f)
                arcTo(88.15f, 88.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                close()
            }
        }.build()

        return _BaseballCapFill!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballCapFill: ImageVector? = null
