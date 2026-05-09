package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SpeakerHighFill: ImageVector
    get() {
        if (_SpeakerHighFill != null) {
            return _SpeakerHighFill!!
        }
        _SpeakerHighFill = ImageVector.Builder(
            name = "Filled.SpeakerHighFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 32.25f)
                lineTo(160f, 223.69f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.91f, 7.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -0.56f)
                lineToRelative(-65.57f, -51f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 176.16f)
                lineTo(80f, 79.84f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.55f, -3.15f)
                lineToRelative(65.57f, -51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0.16f)
                arcTo(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 32.25f)
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
                moveTo(186.77f, 100.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.72f, 11.3f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 31.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 10.58f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -52.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186.74f, 100.84f)
                close()
                moveTo(227.66f, 74.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.92f, 10.66f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 85.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.92f, 10.66f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -106.66f)
                close()
            }
        }.build()

        return _SpeakerHighFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerHighFill: ImageVector? = null
