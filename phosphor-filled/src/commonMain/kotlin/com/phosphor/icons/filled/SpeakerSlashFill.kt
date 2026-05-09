package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SpeakerSlashFill: ImageVector
    get() {
        if (_SpeakerSlashFill != null) {
            return _SpeakerSlashFill!!
        }
        _SpeakerSlashFill = ImageVector.Builder(
            name = "Filled.SpeakerSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(160f, 175.09f)
                verticalLineToRelative(48.6f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.91f, 7.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -0.56f)
                lineToRelative(-65.55f, -51f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 176.18f)
                lineTo(80f, 87.09f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                close()
                moveTo(186.71f, 155.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.29f, -0.7f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -52.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 10.57f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 31.72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186.71f, 155.16f)
                close()
                moveTo(227.63f, 74.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.92f, 10.66f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 85.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.92f, 10.66f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -106.66f)
                close()
                moveTo(153f, 119.87f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -2.7f)
                lineTo(160f, 32.25f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, -6.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, -0.16f)
                lineTo(103.83f, 59.33f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 5.85f)
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
            }
        }.build()

        return _SpeakerSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSlashFill: ImageVector? = null
