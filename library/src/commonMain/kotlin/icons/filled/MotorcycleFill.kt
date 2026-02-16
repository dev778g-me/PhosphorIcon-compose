package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MotorcycleFill: ImageVector
    get() {
        if (_MotorcycleFill != null) {
            return _MotorcycleFill!!
        }
        _MotorcycleFill = ImageVector.Builder(
            name = "Filled.MotorcycleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 120f)
                arcToRelative(41f, 41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.6f, 0.55f)
                lineToRelative(-5.82f, -15.14f)
                arcTo(55.64f, 55.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(196.88f, 88f)
                lineTo(183.47f, 53.13f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 48f)
                lineTo(144f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(26.51f)
                lineToRelative(9.23f, 24f)
                lineTo(152f, 88f)
                curveToRelative(-18.5f, 0f, -33.5f, 4.31f, -43.37f, 12.46f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.76f, 2.07f)
                curveToRelative(-10.58f, -4.81f, -73.29f, -30.12f, -73.8f, -30.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 15.19f)
                reflectiveCurveTo(68.57f, 109.4f, 79.6f, 120.4f)
                arcTo(55.67f, 55.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.43f, 152f)
                lineTo(79.2f, 152f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(52.12f)
                arcToRelative(31.91f, 31.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30.74f, -23.1f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.59f, -33.72f)
                lineToRelative(5.82f, 15.13f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 216f, 120f)
                close()
                moveTo(40f, 168f)
                lineTo(62.62f, 168f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -16f)
                lineTo(40f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(216f, 184f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.58f, -42.23f)
                lineToRelative(8.11f, 21.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.94f, -5.74f)
                lineTo(215.35f, 136f)
                lineToRelative(0.65f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                close()
            }
        }.build()

        return _MotorcycleFill!!
    }

@Suppress("ObjectPropertyName")
private var _MotorcycleFill: ImageVector? = null
