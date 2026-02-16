package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CodesandboxLogoFill: ImageVector
    get() {
        if (_CodesandboxLogoFill != null) {
            return _CodesandboxLogoFill!!
        }
        _CodesandboxLogoFill = ImageVector.Builder(
            name = "Filled.CodesandboxLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.89f, 72.25f)
                verticalLineToRelative(0f)
                lineToRelative(0f, 0f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.18f, -6.06f)
                lineTo(135.68f, 18f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.36f, 0f)
                lineToRelative(-88f, 48.18f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.18f, 6.06f)
                lineToRelative(0f, 0f)
                verticalLineToRelative(0f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, 14f)
                lineToRelative(88f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.36f, 0f)
                lineToRelative(88f, -48.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, -14f)
                lineTo(232f, 80.18f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.89f, 72.25f)
                close()
                moveTo(120f, 219.61f)
                lineTo(88f, 202.09f)
                lineTo(88f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.16f, -7f)
                lineTo(40f, 121f)
                verticalLineToRelative(-32f)
                lineToRelative(80f, 43.8f)
                close()
                moveTo(128f, 118.88f)
                lineTo(48.66f, 75.44f)
                lineTo(83.14f, 56.57f)
                lineToRelative(41f, 22.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.68f, 0f)
                lineToRelative(41f, -22.45f)
                lineToRelative(34.48f, 18.87f)
                close()
                moveTo(216f, 120.98f)
                lineTo(172.16f, 144.98f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.16f, 7f)
                verticalLineToRelative(50.09f)
                lineToRelative(-32f, 17.52f)
                lineTo(136f, 132.74f)
                lineToRelative(80f, -43.8f)
                close()
            }
        }.build()

        return _CodesandboxLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _CodesandboxLogoFill: ImageVector? = null
