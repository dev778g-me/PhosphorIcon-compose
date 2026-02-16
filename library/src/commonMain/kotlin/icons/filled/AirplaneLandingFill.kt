package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AirplaneLandingFill: ImageVector
    get() {
        if (_AirplaneLandingFill != null) {
            return _AirplaneLandingFill!!
        }
        _AirplaneLandingFill = ImageVector.Builder(
            name = "Filled.AirplaneLandingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(104f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(248f, 208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 216f)
                close()
                moveTo(232f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(240f, 148.32f)
                arcToRelative(40.13f, 40.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -29.28f, -38.54f)
                lineToRelative(-60.84f, -17f)
                lineToRelative(-22.5f, -53.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.85f, -4.5f)
                lineToRelative(-5.47f, -1.82f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 48f)
                lineTo(96f, 77.39f)
                lineTo(66.13f, 68.88f)
                lineTo(55.52f, 39.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -4.87f)
                lineToRelative(-5.47f, -1.82f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 48f)
                verticalLineToRelative(55.72f)
                arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.21f, 38.52f)
                lineTo(229.84f, 191.7f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 192f)
                close()
            }
        }.build()

        return _AirplaneLandingFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneLandingFill: ImageVector? = null
