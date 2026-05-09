package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SpeakerSimpleSlashFill: ImageVector
    get() {
        if (_SpeakerSimpleSlashFill != null) {
            return _SpeakerSimpleSlashFill!!
        }
        _SpeakerSimpleSlashFill = ImageVector.Builder(
            name = "Filled.SpeakerSimpleSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(168f, 175.09f)
                verticalLineToRelative(48.6f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.91f, 7.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -0.56f)
                lineTo(85.25f, 176f)
                horizontalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 80f)
                horizontalLineTo(81.55f)
                lineTo(50.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.92f, 34.62f)
                close()
                moveTo(200.53f, 160f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, -8.25f)
                verticalLineTo(104.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.53f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.53f, 8f)
                verticalLineToRelative(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.53f, 160f)
                close()
                moveTo(161f, 119.87f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -2.7f)
                verticalLineTo(32.24f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, -6.39f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, -0.16f)
                lineTo(111.83f, 59.33f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 5.85f)
                close()
                moveTo(231.47f, 80f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 88.27f)
                verticalLineToRelative(79.46f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, -8f)
                verticalLineTo(88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.47f, 80f)
                close()
            }
        }.build()

        return _SpeakerSimpleSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSimpleSlashFill: ImageVector? = null
