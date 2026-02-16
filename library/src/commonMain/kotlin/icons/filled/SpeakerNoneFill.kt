package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SpeakerNoneFill: ImageVector
    get() {
        if (_SpeakerNoneFill != null) {
            return _SpeakerNoneFill!!
        }
        _SpeakerNoneFill = ImageVector.Builder(
            name = "Filled.SpeakerNoneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 84f)
                verticalLineToRelative(88f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(32f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 80f)
                lineTo(60f, 80f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 84f)
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

        return _SpeakerNoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerNoneFill: ImageVector? = null
