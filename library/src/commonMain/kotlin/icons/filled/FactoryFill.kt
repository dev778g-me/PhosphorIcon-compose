package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FactoryFill: ImageVector
    get() {
        if (_FactoryFill != null) {
            return _FactoryFill!!
        }
        _FactoryFill = ImageVector.Builder(
            name = "Filled.FactoryFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 208f)
                horizontalLineToRelative(-8f)
                lineTo(224f, 136f)
                curveToRelative(0f, -0.05f, 0f, -0.09f, 0f, -0.14f)
                reflectiveCurveToRelative(0f, -0.29f, 0f, -0.43f)
                reflectiveCurveToRelative(0f, -0.28f, 0f, -0.41f)
                arcToRelative(0.76f, 0.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.15f)
                lineToRelative(-15f, -105.13f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 193.06f, 16f)
                lineTo(174.94f, 16f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 159.1f, 29.74f)
                lineToRelative(-11.56f, 80.91f)
                lineTo(108.8f, 81.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 88f)
                verticalLineToRelative(32f)
                lineTo(44.8f, 81.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 88f)
                lineTo(32f, 208f)
                lineTo(24f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(232f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(108f, 184f)
                lineTo(80f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(176f, 184f)
                lineTo(148f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(170.67f, 128f)
                lineTo(162.14f, 121.6f)
                lineTo(174.94f, 32f)
                horizontalLineToRelative(18.12f)
                lineToRelative(13.72f, 96f)
                close()
            }
        }.build()

        return _FactoryFill!!
    }

@Suppress("ObjectPropertyName")
private var _FactoryFill: ImageVector? = null
