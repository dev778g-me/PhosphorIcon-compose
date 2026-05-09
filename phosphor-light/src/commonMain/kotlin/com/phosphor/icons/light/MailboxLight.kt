package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MailboxLight: ImageVector
    get() {
        if (_MailboxLight != null) {
            return _MailboxLight!!
        }
        _MailboxLight = ImageVector.Builder(
            name = "Light.MailboxLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 152f)
                lineTo(56f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 144f)
                lineToRelative(0f, -120f)
                lineToRelative(32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 176f)
                verticalLineTo(116f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -52f, -52f)
                horizontalLineTo(76f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 52f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 224f)
                verticalLineTo(184f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(116f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 64f)
            }
        }.build()

        return _MailboxLight!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxLight: ImageVector? = null
