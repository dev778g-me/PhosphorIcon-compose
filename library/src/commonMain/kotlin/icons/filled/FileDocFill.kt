package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FileDocFill: ImageVector
    get() {
        if (_FileDocFill != null) {
            return _FileDocFill!!
        }
        _FileDocFill = ImageVector.Builder(
            name = "Filled.FileDocFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(44f, 120f)
                lineTo(212.07f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(216.07f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152.05f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(76f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44f, 120f)
                close()
                moveTo(152f, 44f)
                lineTo(196f, 88f)
                horizontalLineToRelative(-44f)
                close()
                moveTo(52f, 144f)
                lineTo(36f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(51.33f, 216f)
                curveTo(71f, 216f, 87.55f, 200.52f, 88f, 180.87f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52f, 144f)
                close()
                moveTo(51.51f, 200f)
                lineTo(44f, 200f)
                lineTo(44f, 160f)
                horizontalLineToRelative(8f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20.77f)
                curveTo(71.59f, 191.59f, 62.35f, 200f, 51.52f, 200f)
                close()
                moveTo(222.18f, 195.72f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.73f, 11.09f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.4f, 9.19f)
                curveToRelative(-17.65f, 0f, -32f, -16.15f, -32f, -36f)
                reflectiveCurveToRelative(14.36f, -36f, 32f, -36f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 9.19f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.73f, 11.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.9f, 0.38f)
                arcTo(14.21f, 14.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.06f, 160f)
                curveToRelative(-8.82f, 0f, -16f, 9f, -16f, 20f)
                reflectiveCurveToRelative(7.18f, 20f, 16f, 20f)
                arcToRelative(14.25f, 14.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.23f, -4.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 222.19f, 195.72f)
                close()
                moveTo(128f, 144f)
                curveToRelative(-17.65f, 0f, -32f, 16.15f, -32f, 36f)
                reflectiveCurveToRelative(14.37f, 36f, 32f, 36f)
                reflectiveCurveToRelative(32f, -16.15f, 32f, -36f)
                reflectiveCurveTo(145.69f, 144f, 128f, 144f)
                close()
                moveTo(128f, 200f)
                curveToRelative(-8.83f, 0f, -16f, -9f, -16f, -20f)
                reflectiveCurveToRelative(7.18f, -20f, 16f, -20f)
                reflectiveCurveToRelative(16f, 9f, 16f, 20f)
                reflectiveCurveTo(136.86f, 200f, 128f, 200f)
                close()
            }
        }.build()

        return _FileDocFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocFill: ImageVector? = null
