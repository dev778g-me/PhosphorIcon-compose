package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SpeakerXFill: ImageVector
    get() {
        if (_SpeakerXFill != null) {
            return _SpeakerXFill!!
        }
        _SpeakerXFill = ImageVector.Builder(
            name = "Filled.SpeakerXFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.66f, 146.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(216f, 139.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(204.69f, 128f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(216f, 116.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(227.31f, 128f)
                close()
                moveTo(60f, 80f)
                lineTo(32f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(60f, 176f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(64f, 84f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60f, 80f)
                close()
                moveTo(157.15f, 25.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, -0.16f)
                lineToRelative(-65.57f, 51f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 79.84f)
                verticalLineToRelative(96.32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, 3.15f)
                lineToRelative(65.57f, 51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 0.56f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.91f, -7.18f)
                lineTo(160.03f, 32.25f)
                arcTo(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 157.12f, 25.85f)
                close()
            }
        }.build()

        return _SpeakerXFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerXFill: ImageVector? = null
